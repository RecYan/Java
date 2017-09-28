//  面向对象三个特征： 封装， 继承， 多态。
/*
	类 对现实生活中事物的描述
	对象 就是这类事物 实实在在存在的个体

*/
/*
在内存中的位置：
成员变量: 在堆内存中，因为对象的存在，才在内存中存在
局部变量： 存在于栈内存中
*/
class objectDemo
{
	public static void main(String[] args)
	{
		System.out.println();
		Car c = new Car();// 产生一个类 类型变量 指向对象（该类中产生的实体）
//		c.colour = "blue";	
//		c.run();
		showCar(c);
//		showCar(new Car()); // 匿名对象作为参数传递
	}
	public static void showCar(Car c)
	{
		c.num = 3;
		c.colour = "black";
		c.run();
	}
}

//属性对应类中的变量 行为对应类中的函数 
//定义类 就是定义属性和行为 （成员函数 成员变量）
class Car
{
	// 描述颜色
	String colour = "red";
	// 描述轮胎数
	int num = 4;

	// 描述行为
	void run()
	{
		System.out.println("颜色："+colour+"    "+"轮胎数: "+num);
	}
}
