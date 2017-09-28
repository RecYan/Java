// 饿汉式 --> 推荐
class Single
{
	private Single(){}
	
	private static Single s = new Single();
	
	public static Single getInstance()
	{
		return s;
	}	
}
/*
// 懒汉式 --> 改进双判断
class Single
{
	private Single(){}
	
	private static Single s = null;
	public static Single getInstance()
	{
		synchronizd (Single.class)
		{
			if (s == null)
			{
				s = new Single();
			}
		}
		return s;
	}
}

*/
class SingleDemoTest
{
	public static void main(String[] args)
	{
		System.out.println(Single.getInstance());
	}
}