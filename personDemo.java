/*
当成员变量和局部变量重名，可以用关键字this来区分。

this : 代表对象。代表哪个对象呢？当前对象。
	   this就是所在函数所属对象的引用。
	   简单说：哪个对象调用了this所在的函数，this就代表哪个对象。

this也可以用于在构造函数中调用其他构造函数。
注意：只能定义在构造函数的第一行。因为初始化动作要先执行。
*/
class person
{
	private int age;
	private String name;
	
	person()
	{
		
	}
	person(int age)
	{
		this.age = age;
	}
	person(String name,int age)
	{
		//this.age = age;
		this(age);
		this.name = name;
	}
	
	public void setAge(int a)
	{
		if (a>0 && a<130)
				age = a;
		else
			System.out.println("设置的年龄不合法!");	
	}
	public int getAge()
	{
		return age;
	}
	public void show()
	{
		System.out.println("name = "+this.name+"......"+"age = "+this.age);
	}
	public boolean compareAge(person p)
	{
		return this.age == p.age;
	}
}
class personDemo
{
	public static void main(String[] args)
	{
		person p = new person();
		p.setAge(24);// 封装后 只能使用对外提供的方法（函数）来控制数据操作 
		System.out.println("A: age = "+p.getAge());
		person p1 = new person("xiaoming",24);
		p1.show();
		person p2 = new person(55);
		System.out.println("年龄的比较结果："+p2.compareAge(p1));
	}
}
/*
	person p = new person();
执行步骤：
1 类中static代码块
2 堆内存中开辟空间
3 默认初始化
4 属性进行显示初始化
5 构造代码块初始化
6 构造函数初始化
*/