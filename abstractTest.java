/*
��Աʾ����
���󣺹�˾�г���Ա�����������ţ�нˮ���������ݡ�
��Ŀ������������������ţ�нˮ�����н��𣬹������ݡ�
�Ը�������������ݽ�ģ��

������
��������������У����ҳ��漰�Ķ���
ͨ��������������
����Ա��
	���ԣ����������ţ�нˮ��
	��Ϊ��������
����
	���ԣ����������ţ�нˮ������
	��Ϊ��������

����Ա�;���������ֱ�Ӽ̳й�ϵ��

���ǳ���Ա�;���ȴ���й������ݡ�
���Խ��г�ȡ����Ϊ���Ƕ��ǹ�˾�Ĺ�Ա 

���Խ�����Ա�;�����г�ȡ.������ϵ.	
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
	
	public abstract void work();// ������ ���ṩ�ջ��߾��巽��
	
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