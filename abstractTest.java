/*
雇员示例：
需求：公司中程序员有姓名，工号，薪水，工作内容。
项目经理除了有姓名，工号，薪水，还有奖金，工作内容。
对给出需求进行数据建模。

分析：
在这个问题领域中，先找出涉及的对象。
通过名词提炼法。
程序员：
	属性：姓名，工号，薪水、
	行为：工作。
经理：
	属性：姓名，工号，薪水，奖金。
	行为：工作。

程序员和经理不存在着直接继承关系，

但是程序员和经理却具有共性内容。
可以进行抽取。因为他们都是公司的雇员 

可以将程序员和经理进行抽取.建立体系.	
*/
abstract class Employee
{
	private String name;
	private String id;
	private double salary;
	
	Employee(String name,String id,double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract void work();// 抽象函数 不提供空或者具体方法
	
}
class Pro extends Employee
{
	Pro(String name,String id,double salary)
	{
		super(name,id,salary);
	}
	public void work()
	{
		System.out.println("Pro work....");
	}
}
class Manager extends Employee
{
	private double bouns;
	
	Manager(String name,String id,double salary,double bouns)
	{
		super(name,id,salary);
		this.bouns = bouns;
	}
	public void work()
	{
		System.out.println("Manager work....");
	}
}
class abstractTest
{
	public static void main(String[] args)
	{
		Pro p = new Pro("zhangsan","G1",12345.4321);
		p.work();
		/*
		Manager m = new Manager("lisi","T1",12657.1,1234.9);
		m.work();
		*/
	}
}