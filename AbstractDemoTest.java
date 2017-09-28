abstract class Shape
{
	private String color;
	
	public Shape(String color)
	{
		this.color = color;
	}
	
	public abstract double calPerimeter();
	public abstract String getType();
		
	public String getcolor()
	{
		return color;
	}
}
class Triangle extends Shape
{
	private double a;
	private double b;
	private double c;
	
	public Triangle(String color, double a, double b, double c)
	{
		super(color);
		this.setSides(a, b, c);
	}
	public void setSides(double a, double b, double c)
	{
		if (a>b+c || b>a+c || c>b+c)
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	public double calPerimeter()
	{
		return a+b+c;
	}
	public String getType()
	{
		return "this is a triangle!";
	}	
}
class Circle extends Shape
{
	private double radius;
	
	public Circle(String clolr, double radius)
	{
		super(clolr);
		this.radius = radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	// 重写方法
	public double calPerimeter()
	{
		return 3.14*radius*2;
	}
	public String getType()
	{
		return "this is a circle!"+super.getcolor();
	}	
}
class AbstractTest
{
	public static void main(String[] args)
	{
		Shape s1 = new Triangle("red", 3, 4, 5);
		Shape s2 = new Circle("black", 3.14);
		
		System.out.println(s1.calPerimeter());
		System.out.println(s2.calPerimeter());
	}
}