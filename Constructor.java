class Constructor
{
	String name;
	String colour;
	double weight;
	
	public Constructor(){}
	public Constructor(String name, String colour)
	{
		this.name = name;
		this.colour = colour;
	}
	public Constructor(String name, String colour, double weight)
	{
		// 通过 this 调用另一个重载构造器的构造代码
		this(name, colour);
		this.weight = weight;
	}
	public static void main(String[] args)
	{
		Constructor cs = new Constructor("apple", "red", 12.34);
	}
}