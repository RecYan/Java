class FinalVariableTest
{
	// 成员变量法 1 
	final int a = 6;
	final String str;
	final int b;
	final static double d;
	// final char ch;
	// 成员变量法 2 
	{
		str = "Hello";
	}
	// 成员变量法 3
	public FinalVariableTest()
	{
		b = 3;
	}
	// 类变量 final 用法
	static
	{
		d = 3.5;
	}
	/*
	public char changeChar()
	{
		return ch = 'A';
	}
	*/
	
	
	public static void main(String[] args)
	{
		FinalVariableTest ft = new FinalVariableTest();
		
		System.out.println(ft.a);
		System.out.println(ft.str);
		System.out.println(ft.d);
		
		int age;
		
			System.out.println(age);
		
	}
}