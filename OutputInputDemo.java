package com.JavaeeExcl.www;
/*
 * �����̼߳�ļ�ͨ��ʾ�� 
 * 
 * ��֤ͬ������ǰ��
 * 	1 �Ƿ���߳�
 * 	2 �Ƿ�ʹ��ͬһ����
 * */
// ��resource����Ƴɶ���ʽ
/*
  class resource{
 // ���๹�췽��˽�л� �������ⲿ���г�ʼ��
  private resource(){}
 // ���������Ϊ��̬ ͨ����������  ������ͨ���������� �����������ݡ�����
  private static resource r = new resource();
 // �����ṩ��ȡ���Ψһ���� 
  public resource getResource(){
  		return r;	
  }
 }
 * */

class resource{
	private String name;
	private String sex;
	 // ���־λ��ʼΪfalse
	private boolean flag = false;
	
	public synchronized void setRes(String name, String sex){
		if (flag){
			
			try{
				// �����̳߳���ͬһ�������߳� �Ǿ�̬ʹ��this��
				this.wait();
			}
			catch (Exception e){}
		}
		this.name = name;
		this.sex = sex;
		flag = true;
		// �����̳߳���ͬһ�������߳�
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
	// ����һ������� ��֤�����߳�ʹ��ͬһ����Դ
	// Ҳ�ɽ�resource���Ϊ����ģʽ
	private resource r;
	int x = 0;
	// ��ʼ����
	Input(resource r){
		this.r = r;
	}
	public void run(){
		while (true){
			// ʹ��ͬһ����
			//synchronized(r){
				// �жϱ�־λ �� ��д���� ����ȴ�
				/*
				if (r.flag){
					
					try{
						// �����̳߳���ͬһ�������߳�
						r.wait();
					}
					catch (Exception e){}
				}
				*/
				// �����л�Input��ֵ				
				if (x==0){
					r.setRes("mike", "man");
					
				}
				else{
					r.setRes("���", "��");	
				}
				x = (x+1)%2;
				//r.flag = true;
				// �����̳߳���ͬһ�������߳�
				//r.notify();
			//}
			
		}
	}
}
class Output implements Runnable{
	// ����һ������� ��֤�����߳�ʹ��ͬһ����Դ
	private resource r;
	// ��ʼ����
	Output(resource r){
		this.r = r;
	}
	public void run(){
		while (true){
			
			// ʹ��ͬһ���� 
			/*
			synchronized(r){
				// �жϱ�־λ �� �Ͷ�ȡ���� ����ȴ�
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

��ʹ����ͬ���У���ΪҪ�Գ��м�����(��)���̲߳�����
����Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž�������

Ϊʲô��Щ�����̵߳ķ���Ҫ����Object�����أ�
��Ϊ��Щ�����ڲ���ͬ�����߳�ʱ��������Ҫ��ʶ�����������߳�ֻ�е�����
ֻ��ͬһ�����ϵı��ȴ��̣߳����Ա�ͬһ������notify���ѡ�
�����ԶԲ�ͬ���е��߳̽��л��ѡ�

Ҳ����˵���ȴ��ͻ��ѱ�����ͬһ������

��������������������Կ��Ա����������õķ�������Object���С�


*/



public class OutputInputDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		resource r = new resource();
		
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();
		

	}

}
