class OperateDemo1
{
	public static void main(String[] args)
	{
		int a = 4;
		int b = 5;
		//int temp;
		System.out.println("a="+a + ",b="+b);
		
		/*
		temp = a;
		a = b;
		b = temp;
		*/
		
		// ִ��Ч�ʸ�
		a = a ^ b;
		b = a ^ b;
		a = b ^ a;
		
		System.out.println("a="+a + ",b="+b);
		
	}
}