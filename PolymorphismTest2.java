class Baseclass
{
	int book = 6;
	
	public void base()
	{
		System.out.println("base.method");
	}
	
	public void test()
	{
		System.out.println("base.test");
	}
}
class Subclass extends Baseclass
{
	private int book = 8;
	
	public void sub()
	{
		System.out.println("sub.method");
	}
	public void test()
	{
		System.out.println("sub.test");
	}
}
class PolymorphismTest2
{
	public static void main(String[] args)
	{
		// 编译看左 运行看右
		// 向上转型
		//Baseclass bs = new Subclass();
		
		//bs.test();
		
		// 向下转型 case1 
		//Subclass sc = (Subclass) bs;
		//sc.test();
		// 向下转型 case2 error 使用 instanceof 解决
	
		Baseclass bc = new Baseclass();
		
		if (bc instanceof Subclass)
		{
			Subclass sc = (Subclass) bc;
			sc.test();
		}
		
		
		// 向下转型 应 先向上转 之后再向下转
		
	}
}