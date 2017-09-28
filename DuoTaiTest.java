/*
在多态中费静态成员函数的特点：（动态绑定 看对象）
在编译时期：参阅引用型变量所属的类中是否有调用的方法。如果有，编译通过，如果没有编译失败。
在运行时期：参阅对象所属的类中是否有调用的方法。
简单总结就是：成员函数在多态调用时，编译看左边，运行看右边。


在多态中，成员变量的特点：
无论编译和运行，都参考左边(引用型变量所属的类)。


在多态中，静态成员函数的特点：(静态绑定 看类)
无论编译和运行，都参考做左边。


*/

/*
多态：可以理解为事物存在的多种体现形态。

人：男人，女人

动物：猫，狗。

猫 x = new 猫();

动物 x = new 猫();

1，多态的体现
	父类的引用指向了自己的子类对象。
	父类的引用也可以接收自己的子类对象。
2，多态的前提
	必须是类与类之间有关系。要么继承，要么实现。
	通常还有一个前提：存在覆盖。

3，多态的好处
	多态的出现大大的提高程序的扩展性。

4，多态的弊端：
	提高了扩展性，但是只能使用父类的引用访问父类中的成员。

5，多态的应用


第二个问题：如何使用子类特有方法。


*/
abstract class Animal
{
	abstract void eat();
}
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("eat fish......");
	}
	public void catchMouse()
	{
		System.out.println("catch mouse......");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("eat bone......");
	}
	public void safeHome()
	{
		System.out.println("safe home......");
	}
}
class DuoTaiTest
{
	public static void main(String[] args)
	{
		//Animal a = new Cat();//类型提升。 向上转型。
		//a.eat();

		//如果想要调用猫的特有方法时，如何操作？
		//强制将父类的引用。转成子类类型。向下转型。
		///Cat c = (Cat)a;
		//c.catchMouse();
		/*
		千万不要出现这样的操作，就是将父类对象转成子类类型。
		我们能转换的是父类应用指向了自己的子类对象时，该应用可以被提升，也可以被强制转换。
		多态自始至终都是子类对象在做着变化。
		*/
//		Animal a = new Animal();
//		Cat c = (Cat)a;
		
		//Animal a = new Dog();
		//a.eat();
		//animalAct(new Cat());
		//如果想要调用猫的特有方法时，如何操作？
		//强制将父类的引用。转成子类类型。向下转型。
		Animal a = new Dog();
		// 报错 因为父类中没有定义这个方法 编译不会通过
		// a.safeHome();
		Dog d = (Dog)a;
		d.safeHome();
		animalAct(new Cat());
		animalAct(new Dog());
		
	}
	// 多态体现
	public static void animalAct(Animal a)
	{
		a.eat();
		// 多态实现 一定要存在覆盖关系 不能调用父类中没有定义的方法
		// a.catchMouse();
		// 改进 使用 instanceof 关键字
		if (a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else
		{
			System.out.println("cast error.......");
		}
	}
}