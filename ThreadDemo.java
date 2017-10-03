/*
创建线程的第一种方式：继承Thread类。
步骤：
1，定义类继承Thread。
2，复写Thread类中的run方法。
	目的：将自定义代码存储在run方法。让线程运行。

3，调用线程的start方法，
	该方法两个作用：启动线程，调用run方法。
*/	
class Demo extends Thread
{
	// 自定义线程名称 父类已经完成了初始化构造 子类可以直接调用 与Exception 类似
	/*
	Demo(String name)
	{
		super(name);
	}
	*/  
	public void run()
	{
		for (int x=0; x<50; x++)
		{
			// getName() 方法 获取线程名称
			System.out.println(this.getName()+" ......."+x);
			//System.out.println(Thread.currentThread().getName());
		}	
			
	}
}


class ThreadDemo
{
	public static void main(String[] agrs)
	{
		//Demo d = new Demo("One");
		Demo d = new Demo();
		//d.run; // 仅仅是对象调用方法 上面的线程只创建 但不会开启
		// Thread类中 start()方法
			/* 1 启动线程
			   2 调用线程中的run()方法
			*/  
		d.start();
		for (int x=0; x<50; x++)
		{
			System.out.println("main run........." +x);
		}	
	
	}
}
/*
输出：
------------------------------------------------------
main run.........0
main run.........1
main run.........2
main run.........3
main run.........4
main run.........5
main run.........6
main run.........7
main run.........8
main run.........9
Thread-0 .......0
Thread-0 .......1
Thread-0 .......2
Thread-0 .......3
Thread-0 .......4
Thread-0 .......5
Thread-0 .......6
Thread-0 .......7
Thread-0 .......8
main run.........10
main run.........11
main run.........12

*/