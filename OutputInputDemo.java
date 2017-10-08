package com.JavaeeExcl.www;
/*
 * 两个线程间的简单通信示例 
 * 
 * 保证同步两个前提
 * 	1 是否多线程
 * 	2 是否使用同一个锁
 * */
// 将resource类设计成饿汉式
/*
  class resource{
 // 将类构造方法私有化 不允许外部进行初始化
  private resource(){}
 // 将类变量设为静态 通过类名调用  而不能通过创建对象 访问类中数据、方法
  private static resource r = new resource();
 // 对外提供获取类的唯一方法 
  public resource getResource(){
  		return r;	
  }
 }
 * */

class resource{
	private String name;
	private String sex;
	 // 设标志位初始为false
	private boolean flag = false;
	
	public synchronized void setRes(String name, String sex){
		if (flag){
			
			try{
				// 冻结线程池中同一个锁的线程 非静态使用this锁
				this.wait();
			}
			catch (Exception e){}
		}
		this.name = name;
		this.sex = sex;
		flag = true;
		// 唤醒线程池中同一个锁的线程
		this.notify();
		
		
	}
	public synchronized void outRes(){
		if (!flag){
			try{
				this.wait();
			}
			catch (Exception e){}	
		}
		System.out.println(name+"........."+sex);
		flag = false;
		this.notify();
	}
	 
}
class Input implements Runnable{
	// 定义一个类变量 保证两个线程使用同一个资源
	// 也可将resource类改为单例模式
	private resource r;
	int x = 0;
	// 初始化类
	Input(resource r){
		this.r = r;
	}
	public void run(){
		while (true){
			// 使用同一个锁
			//synchronized(r){
				// 判断标志位 假 就写数据 真则等待
				/*
				if (r.flag){
					
					try{
						// 冻结线程池中同一个锁的线程
						r.wait();
					}
					catch (Exception e){}
				}
				*/
				// 轮流切换Input赋值				
				if (x==0){
					r.setRes("mike", "man");
					
				}
				else{
					r.setRes("麦克", "男");	
				}
				x = (x+1)%2;
				//r.flag = true;
				// 唤醒线程池中同一个锁的线程
				//r.notify();
			//}
			
		}
	}
}
class Output implements Runnable{
	// 定义一个类变量 保证两个线程使用同一个资源
	private resource r;
	// 初始化类
	Output(resource r){
		this.r = r;
	}
	public void run(){
		while (true){
			
			// 使用同一个锁 
			/*
			synchronized(r){
				// 判断标志位 真 就读取数据 假则等待
				if (!r.flag){
					try{
						r.wait();
					}
					catch (Exception e){}
					
				}
				*/
			  r.outRes();
				//r.flag = false;
				//r.notify();
			//}
		}
		
	}
}
/*
wait:
notify();
notifyAll();

都使用在同步中，因为要对持有监视器(锁)的线程操作。
所以要使用在同步中，因为只有同步才具有锁。

为什么这些操作线程的方法要定义Object类中呢？
因为这些方法在操作同步中线程时，都必须要标识它们所操作线程只有的锁，
只有同一个锁上的被等待线程，可以被同一个锁上notify唤醒。
不可以对不同锁中的线程进行唤醒。

也就是说，等待和唤醒必须是同一个锁。

而锁可以是任意对象，所以可以被任意对象调用的方法定义Object类中。


*/



public class OutputInputDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		resource r = new resource();
		
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();
		

	}

}
