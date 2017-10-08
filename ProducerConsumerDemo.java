package com.JavaeeExcl.www;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


//-----------------------------------------------------------------------
/*
JDK1.5 ���ṩ�˶��߳��������������
��ͬ��Synchronized�滻����ʵLock������
��Object�е�wait��notify notifyAll���滻��Condition����
�ö������Lock�� ���л�ȡ��
	ʵ���˱���ֻ���ѶԷ�������

Lock:�����Synchronized
	lock 
	unlock
	newCondition()

Condition�������Object wait notify notifyAll
	await();
	signal();
	signalAll();
*/
//-----------------------------------------------------------------------------

class res{
	private String name;
	private int count = 100000000;
	private boolean flag = true;
	
	// ���߳����������������ͬ��Synchronized�滻����ʵLock������
			Lock lock = new ReentrantLock();
			
			//  Lock�����������--֧�ֶ����ص� Condition����
			Condition condition_con = lock.newCondition(); 
			Condition condition_pro = lock.newCondition(); 
	
	public void setRes(String name){	

		lock.lock();
		try{
			
			//while()ѭ��--�ñ����ѵ��߳���һ���жϱ�ǡ�
			while (!flag){

					// ���᱾���߳�
					condition_pro.await();
			}
			this.name = name;
			System.out.println(Thread.currentThread().getName()+"...."+name+"...."+"........pro....."+count);
			flag = false;
			
			//���ѶԷ��̡߳�		
			condition_con.signalAll();
			
		}
		catch (Exception e){}
		
		// �����ͷ���Դ--��ֹ���쳣���̲߳��ͷ���
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
		// TODO �Զ����ɵķ������
		
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
