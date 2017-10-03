
/*
需求：简单的卖票程序。
多个窗口同时买票。

创建线程的第二种方式：实现Runable接口
1，定义类实现Runnable接口
2，覆盖Runnable接口中的run方法。
	将线程要运行的代码存放在该run方法中。

3，通过Thread类建立线程对象。
4，将Runnable接口的子类对象作为实际参数传递给Thread类的构造函数。
	为什么要将Runnable接口的子类对象传递给Thread的构造函数。
	因为，自定义的run方法所属的对象是Runnable接口的子类对象。
	所以要让线程去指定指定对象的run方法。就必须明确该run方法所属对象。
	
5，调用Thread类的start方法开启线程并调用Runnable接口子类的run方法。


实现方式和继承方式有什么区别呢？

实现方式好处：避免了单继承的局限性。
在定义线程时，建议使用实现方式。

两种方式区别：
继承Thread:线程代码存放Thread子类run方法中。
实现Runnable，线程代码存在接口的子类的run方法。
---------------------------------------------------------------------------
多线程的运行出现了安全问题。

问题的原因：
	当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，还没有执行完，
	另一个线程参与进来执行。导致共享数据的错误。

解决办法：
	对多条操作共享数据的语句，只能让一个线程都执行完。在执行过程中，其他线程不可以参与执行。



Java对于多线程的安全问题提供了专业的解决方式。

就是同步代码块。

synchronized(对象)
{
	需要被同步的代码,就是线程要执行的代码

}
对象如同锁。持有锁的线程可以在同步中执行。
没有持有锁的线程即使获取cpu的执行权，也进不去，因为没有获取锁。
*/
class ticket implements Runnable
{
	private int ticket = 100;
	// 将票静态为所有线程共有 可以解决问题 但不推荐 应为其生命周期过长
	//private static int ticket = 100;
	// 创建一个"万能锁" 
	Object obj = new Object();
	
	public void run() //throws Exception
	{
		// 出现多个线程 卖同一个票问题 
			// ``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
		while (true)
		{
				// 多线程安全问题
				// 因为实现了接口--被覆盖的run()方法未抛出Exception 所以这里只能采取下面处理 而不能抛异常
				// 解决办法：加锁--限制只能一个进程进入
				/*
					"锁" 原理：
						假设锁有两个标志位 1为开 0为关
							设1号线程获取 1标志位 进入该同步代码中 随后将标志位改成0 在执行完整个代码块后
							再讲标志位置为1 
				*/
				synchronized (obj)
				{
					if (ticket > 0)
					{
						try
						{
							Thread.sleep(10);
						}
						catch (Exception e)
						{
					
						}
						System.out.println(Thread.currentThread().getName()+".....sale......"+ticket--);
					}
					
				}
				//Thread.sleep(10);
						//throw new Exception();
		}
		
	}
}
class sellTicket
{
	public static void main(String[] args)
	{
		ticket t = new ticket();
		
		// 分配一个新的Thread对象
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
	}
}