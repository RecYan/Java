/*
接口：初期理解，可以认为是一个特殊的抽象类
	当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示。
class用于定义类
interface 用于定义接口。

接口定义时，格式特点：
1，接口中常见定义：常量，抽象方法。
2，接口中的成员都有固定修饰符。
	常量：public static final
	方法：public abstract 
记住：接口中的成员都是public的。


接口：是不可以创建对象的，因为有抽象方法。
需要被子类实现，子类对接口中的抽象方法全都覆盖后，子类才可以实例化。
否则子类是一个抽象类。

接口可以被类多实现，也是对多继承不支持的转换形式。java支持多实现。


*/
abstract class Student
{
	abstract void study();
	abstract void sleep();
}
// 接口仍然是抽象的 定义方法不能定义方法体
interface Smoke
{
	//public static void smoke();
	 void smoke();
}
class Basestudent extends Student implements Smoke
{
	void study()
	{
		
	}
	void sleep()
	{
		System.out.println("base sleep........");
	}
	// 这里复写接口中的方法 修饰符必须是 public 
	public void smoke()
	{
		System.out.println("base smoke........");
	}
}
class InterfaceDemo
{
	public static void main(String[] args)
	{
		new Basestudent().smoke();
		new Basestudent().sleep();
	}
}