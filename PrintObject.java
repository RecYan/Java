class person
{
	private String name;
	public person(String name)
	{
		this.name = name;
	}
}
class PrintObject
{
	public static void main(String[] args)
	{
		person p = new person("mike");
		// person@15db9742 类名 @ hashCode "自我描述"功能
		System.out.println(p);
		//System.out.println(p.toString());
	}
}