/*生产者 消费者 多线程实现*/
class Res
{
	private String name;
	private int count = 1;
	private boolean falg = false;
	
	public synchronized void Set(String name)
	{
		if(flag)
		{
			try
			{
				this.wait();
			}
			catch (Exception e)
			{
				
			}
		}
		else
		{
			this.name = name+"......."+count++;
			System.out.println(Thread.currentThread().getName()+"...producer.."+this.name);
		}
		flag = true;
		this.notify();	
		
	}
	public synchronized void Out()
	{
		if(!flag)
		{
			try
			{
				this.wait();
			}
			catch (Exception e)
			{
				
			}
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+"...consumer.."+this.name);
		}
		flag = false;
		this.notify();			
	}		
}
class Producer implements Runnable
{
	private Res r;
	
	Producer(Res r)
	{
		this.r = r;
	}
	
	public void run()
	{
		while(true)
		{
			r.Set("product");
		}
	
	}	
}
class Consumer implements Runnable
{
	private Res r;
	
	Consumer(Res r)
	{
		this.r = r;
	}
	
	public void run()
	{
		while(true)
		{
			r.Out();
		}
	}	
}
class ProducerConsumerDemo
{
	public static void main(String[] args)
	{
		Res r = new Res();
		
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		
		t1.start();
		t2.start();		
	}
}