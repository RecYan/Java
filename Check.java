/*
	验证类初始化 各部分执行的顺序
*/
class A
{
	public A()
	{
		System.out.println("A");
	}
	public A(String s)
	{
		System.out.println(s);
	}
}
class B extends A
{
	public B()
	{
		System.out.println("B");
	}
	public B(String s)
	{
		this();
		//super("test");
		System.out.println(s);
	}
}
class Check
{
	public static void main(String[] args)
	{
		new B("check");
	}
}