class OperateDemo
{
	public static void main(String[] args)
	{
		int x = 4;
		short s = 3;
		
		//s = x + s; 从int转换到short可能会有损失 这是一个两步操作
		//x = x + s; Ok
		s+=x; // 一步操作 自动完成类型转化
		
		System.out.println(s);
		System.out.println(3 > 4); // 比较运算符 返回布尔类型 true 或 false
		System.out.println(3 != 4);
		
		int a = 4;
		int b = 5;
		//int temp;
		System.out.println("a="+a + ",b="+b);
		
		/*
		temp = a;
		a = b;
		b = temp;
		*/
		
		a = a ^ b;
		b = a ^ b;
		a = b ^ a;
		
		System.out.println("a="+a + ",b="+b);
	}
}