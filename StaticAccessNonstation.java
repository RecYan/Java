class StaticAccessNonstation
{
	int foo;
	public int ThisInConstructer()
	{
		int foo = 0;
		foo = 6;
		return foo;
	}	
	public void Info()
	{
		System.out.println("info......");
	}
	public void Talk()
	{
		Info();// 默认主调为 this
	}
	public static void main(String[] args)
	{
		//Info();  静态成员不能访问非静态成员 
		new StaticAccessNonstation().Info(); // 默认主调为 static
		System.out.println(new StaticAccessNonstation().ThisInConstructer() );
	}
}