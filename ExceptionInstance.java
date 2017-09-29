/*
老师用电脑上课。

开始思考上课中出现的问题。


比如问题是
	电脑蓝屏。
	电脑故障。

要对问题进行描述，封装成对象。


可是当故障发生后，出现讲课进度无法继续。

出现了讲师的问题：课时计划无法完成。

*/
class buleScreenException extends Exception
{
	buleScreenException(String msg)
	{
		super(msg);
	}
}
class breakDownException extends Exception
{
	breakDownException(String msg)
	{
		super(msg);
	}
}
// 自定义一个老师可以处理的异常
class changeRoomException extends Exception
{
	changeRoomException(String msg)
	{
		super(msg);
	}
}
class Computer
{
	// state=1 正常
	// state=2 蓝屏
	// state=3 故障
	private int state = 3;
	
	public void run() throws buleScreenException,breakDownException
	{
		if (state == 2)
			throw new buleScreenException("电脑蓝屏啦......");
		if (state == 3)
			throw new breakDownException("电脑故障啦......");
		System.out.println("comoputer run......");
	}
	public void reset()
	{
		System.out.println("comoputer reset......");
		state = 1;
	}
}
class Teacher
{
	private String name;
	private Computer cmpt;
	
	Teacher(String name)
	{
		this.name = name;
		cmpt = new Computer();
	}
	// 因为 changeRoomException 未继承 RuntimeException 所以需要在方法上声明该异常
	public void prelect() throws changeRoomException
	{
		try
		{
			cmpt.run();
			System.out.println("teacher prelect......");
		}
		catch (buleScreenException e)
		{
			System.out.println(e.toString());
			cmpt.reset();
			System.out.println("--------------------------------");
			prelect();
		}
		catch (breakDownException e)
		{
			// 机器故障老师 已不好处理 故需要抛出一个老师可以处理的异常 而不是将 breakDownException 这个异常抛出
			throw new changeRoomException("换教室.......");
		}
		
	}
}

class ExceptionInstance
{
	public static void main(String[] args)
	{
		Teacher t = new Teacher("mike");
		try
		{
			t.prelect();
		}
		catch (changeRoomException e)
		{
			System.out.println(e.toString());
			System.out.println("------------------------------------------------");
			System.out.println("继续上课..........");
		}
		
		
	}
}