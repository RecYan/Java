
class Singleton
{
	private static Singleton instance;
	private Singleton(){}
	public static Singleton getInstance()
	{
		if (instance == null)
		{
			instance = new Singleton();
		}
		return instance;
		
	}
	
	
}
class SingletonTest
{
	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		// 两次产生的对象实际上都是同一个对象
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}