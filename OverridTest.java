// 继承中方法的重写 子父类 方法名 参数列表要相同 子类是父类的拓展 方法权限为 private 时不能重写该方法
/*
	重载 重写 区别
	重载 同类中 方法同名的处理
	重写 子父类中方法的覆盖 重写
*/
class Bird
{
	public void act()
	{
		System.out.println("fly in the sky......");
	}
}
class Ostrich extends Bird
{
	public void act()
	{
		System.out.println("run on the land.....");
	}
}
class OverridTest
{
	public static void main(String[] args)
	{
		Ostrich os = new Ostrich();
		os.act();
	}
	
}