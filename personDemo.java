/*
����Ա�����;ֲ����������������ùؼ���this�����֡�

this : ������󡣴����ĸ������أ���ǰ����
	   this�������ں���������������á�
	   ��˵���ĸ����������this���ڵĺ�����this�ʹ����ĸ�����

thisҲ���������ڹ��캯���е����������캯����
ע�⣺ֻ�ܶ����ڹ��캯���ĵ�һ�С���Ϊ��ʼ������Ҫ��ִ�С�
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
			System.out.println("���õ����䲻�Ϸ�!");	
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
		p.setAge(24);// ��װ�� ֻ��ʹ�ö����ṩ�ķ��������������������ݲ��� 
		System.out.println("A: age = "+p.getAge());
		person p1 = new person("xiaoming",24);
		p1.show();
		person p2 = new person(55);
		System.out.println("����ıȽϽ����"+p2.compareAge(p1));
	}
}
/*
	person p = new person();
ִ�в��裺
1 ����static�����
2 ���ڴ��п��ٿռ�
3 Ĭ�ϳ�ʼ��
4 ���Խ�����ʾ��ʼ��
5 ���������ʼ��
6 ���캯����ʼ��
*/