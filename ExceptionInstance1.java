interface shape
{
	public void getArea();
}
// 继承 RuntimeException 强制使程序在错误处结束 
class falseValueException extends RuntimeException
{
	falseValueException(String msg)
	{
		super(msg);
	}
}
class Rec implements shape
{
	private double len;
	private double wid;
	public static final double PI = 3.14;
	
	Rec(double len, double wid)
	{
		if (len<0 || wid<0)
			// 继承 RuntimeException--这是个特例---不需要在方法上声明该异常
			throw new falseValueException("输入的参数出错啦........");
		this.len = len;
		this.wid = wid;
	}
	public void getArea()
	{
		System.out.println("Rec.area: "+len*wid*PI);
	}
	
}
class ExceptionInstance1
{
	public static void main(String[] args)
	{
		//Rec c = new Rec(3, 4);
		//继承RuntimeException时 不进行 try catch 处理
		
		Rec c = new Rec(3, -4);
		c.getArea();
		
		
	}
}