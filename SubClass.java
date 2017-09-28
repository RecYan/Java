class BaseClass
{
	int num = 6;
	
	public void base()
	{
		System.out.println("a");
	}
	public void test()
	{
		System.out.println("b");
	}

	class SubClass extends Baseclass
	{
		int num = 3;
		
		public void sub()
		{
			System.out.println("c");
		}
		public void test()
		{
			System.out.println("d");
		}
	}
	public static void main(String[] args)
	{
		//成员函数在多态调用时，编译看左边，运行看右边。
		BaseClass bs = new SubClass();
	
		System.out.println(bs.base());
		System.out.println(base.test());
	}
}