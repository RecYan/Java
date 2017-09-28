/*
设计模式：对问题行之有效的解决方式。其实它是一种思想。

1,单例设计模式。
	解决的问题：就是可以保证一个类在内存中的对象唯一性。

必须对于多个程序使用同一个配置信息对象时，就需要保证该对象的唯一性。

如何保证对象唯一性呢？
1，不允许其他程序用new创建该类对象。
2，在该类创建一个本类实例。
3，对外提供一个方法让其他程序可以获取该对象。

步骤：
1，私有化该类构造函数。
2，通过new在本类中创建一个本类对象。
3，定义一个公有的方法，将创建的对象返回。

*/
class single
{
	private int num;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	//------------------
	private single()// 保证不创建对象 只能通过类名调用 对象唯一
	{
	
	}
	private static single s = new single();
	public static single getInstance()// static修饰 可以保证类名调用 且 静态函数 只能传静态变量
	{
		return s;
	}
	//------------------------
}
class singleDemo
{
	public static void main(String[] args)
	{
		single s1 = single.getInstance();// 没有对象 只能通过类名调用
		single s2 = single.getInstance();
		s1.setNum(20);
		System.out.println("s1.num = "+s1.getNum());
		System.out.println("s2.num = "+s2.getNum());
	}
}