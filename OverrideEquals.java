class Person
{
	private String name;
	private String id;
	public Person(){}
	public Person(String name, String id)
	{
		this.name = name;
		this.id = id;
	}
	public String getId()
	{
		return id;
	}
	// 重写 equals 方法 
	public boolean equals(Object obj)
	{
		// 两个对象为同一个对象
		if (this == obj)
		{
			return true;
		}
		// 只有obj 是 Person 对象时 两个对象为同一个类的实例时 用equals 方法
		if (obj!=null && obj.getClass() == Person.class)
		{
			Person personObj = (Person)obj;
			if (this.getId().equals(personObj.getId()))
			{
				return true;
			}
		}
		return false;
	}
}
class OverrideEquals
{
	public static void main(String[] args)
	{
		Person p1 = new Person("lili", "1234");
		Person p2 = new Person("lil", "1234");
		Person p3 = new Person("lili", "12345");
		
		System.out.println("p1、p2是否相等？"+p1.equals(p2));
		System.out.println("p1、p3是否相等？"+p1.equals(p3));
		
	}
}