/*
因为项目中会出现特有的问题，
而这些问题并未被java所描述并封装对象。
所以对于这些特有的问题可以按照java的对问题封装的思想。
将特有的问题。进行自定义的异常封装。

自定义异常。

需求：在本程序中，对于除数是-1，也视为是错误的是无法进行运算的。
那么就需要对这个问题进行自定义的描述。

当在函数内部出现了throw抛出异常对象，那么就必须要给对应的处理动作。
要么在内部try catch处理。
要么在函数上声明让调用者处理。

一般情况在，函数内出现异常，函数上需要声明。


发现打印的结果中只有异常的名称，却没有异常的信息。
因为自定义的异常并未定义信息。

如何定义异常信息呢？
因为父类中已经把异常信息的操作都完成了。
所以子类只要在构造时，将异常信息传递给父类通过super语句。
那么就可以直接通过getMessage方法获取自定义的异常信息。



自定义异常：
必须是自定义类继承Exception。


继承Exception原因：
异常体系有一个特点：因为异常类和异常对象都被抛出。
他们都具备可抛性。这个可抛性是Throwable这个体系中独有特点。

只有这个体系中的类和对象才可以被throws和throw操作。



throws和throw的区别
throws使用在函数上。
throw使用在函数内。

throws后面跟的异常类。可以跟多个。用逗号隔开。
throw后跟的是异常对象。

对多异常的处理。

1，声明异常时，建议声明更为具体的异常。这样处理的可以更具体。
2，对方声明几个异常，就对应有几个catch块。不要定义多余的catch块。
	如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面。


建立在进行catch处理时，catch中一定要定义具体处理方式。
不要简单定义一句 e.printStackTrace(),
也不要简单的就书写一条输出语句。


*/
// 自定义异常类 通用模式 
class ArithmeticException extends Exception
{
	private int num;
	
	ArithmeticException(String msg, int num)
	{
		super(msg);
		this.num = num;
		
		//System.out.println("错误信息："+msg+"出错的数为："+num);
	}
	public int getNum()
	{
		return num;
	}
}
class Count 
{
	int a;
	int b;
	
	public int div(int a, int b)throws ArithmeticException // 抛出自定义异常类
	{
		if (b == 0)
			throw new ArithmeticException("除零啦！", b); //throw抛出自定义异常对象
	    if (b < 0)
			throw new ArithmeticException("除数小于零啦！", b);
		return a/b;
	}
}

class ExceptionTest
{
	public static void main(String[] args)
	{
		Count c = new Count();
		//System.out.println("result: "+c.div(4,0));
		try
		{
			int d = c.div(4, 0);
			System.out.println(d);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e.toString());
			System.out.println("错误的数为："+e.getNum());
			
			//System.out.println(e.getMessage());
		}
	}
	
}