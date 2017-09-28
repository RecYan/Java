/ final 局部变量 /
class FinalLocalVariableTest
{
	public void test(final int a)
	{
		// 不能对final 修饰的形参赋值
		// a = 5;
	}
	public static void main(String[] args)
	{
		final String str = "hello";
		final double d;
		
		d = 5.5;
	}
}