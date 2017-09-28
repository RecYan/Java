class Person
{
	private int age;
	
	public Person(int age)
	{
		this.age = age;
	}
	
	public boolean compareAge(Person p)
	{
		return this.age == p.age;
	}
}
class ThisTest
{
	public static void main(String[] args)
	{
		Person p = new Person(20);
		Person p1 = new Person(25);
		
		System.out.println(P.compareAge(p1));
		
	}
}