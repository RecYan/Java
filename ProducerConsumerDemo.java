package com.JavaeeExcl.www;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


//-----------------------------------------------------------------------
/*
JDK1.5 中提供了多线程升级解决方案。
将同步Synchronized替换成现实Lock操作。
将Object中的wait，notify notifyAll，替换了Condition对象。
该对象可以Lock锁 进行获取。
	实现了本方只唤醒对方操作。

Lock:替代了Synchronized
	lock 
	unlock
	newCondition()

Condition：替代了Object wait notify notifyAll
	await();
	signal();
	signalAll();
*/
//-----------------------------------------------------------------------------

class res{
	private String name;
	private int count = 100000000;
	private boolean flag = true;
	
	// 多线程升级解决方案。将同步Synchronized替换成现实Lock操作。
			Lock lock = new ReentrantLock();
			
			//  Lock对象的新特性--支持多个相关的 Condition对象
			Condition condition_con = lock.newCondition(); 
			Condition condition_pro = lock.newCondition(); 
	
	public void setRes(String name){	

		lock.lock();
		try{
			
			//while()循环--让被唤醒的线程再一次判断标记。
			while (!flag){

					// 冻结本方线程
					condition_pro.await();
			}
			this.name = name;
			System.out.println(Thread.currentThread().getName()+"...."+name+"...."+"........pro....."+count);
			flag = false;
			
			//唤醒对方线程。		
			condition_con.signalAll();
			
		}
		catch (Exception e){}
		
		// 必须释放资源--防止抛异常的线程不释放锁
		finally{
			lock.unlock();
		}
	}
	public void outRes(){
		lock.lock();
		
		try{
			while (flag){
				condition_con.await();
			}
			System.out.println(Thread.currentThread().getName()+"...."+name+"...."+".........con................."+count--);
			flag = true;
			condition_pro.signalAll();
		}
		catch (Exception e){}
		finally{
			lock.unlock();
		}
	}
}
class producer implements Runnable{
	private res r;
	
	producer(res r){
		this.r = r;
	}
	
	public void run(){
		while (true){
			r.setRes("book");
		}
	}
}
class consumer implements Runnable{
	private res r;
	
	consumer(res r){
		this.r = r;
	}
	
	public void run(){
		while (true){
			r.outRes();
		}
	}
}
public class ProducerConsumerDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		res r = new res();
		
		producer pro1 = new producer(r);
		producer pro2 = new producer(r);
		consumer con1 = new consumer(r);
		consumer con2 = new consumer(r);
		
		
		
		Thread t1 = new Thread(pro1);
		Thread t2 = new Thread(pro2);
		Thread t3 = new Thread(con1);
		Thread t4 = new Thread(con2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
