class OperateDemo
{
	public static void main(String[] args)
	{
		int x = 4;
		short s = 3;
		
		//s = x + s; ��intת����short���ܻ�����ʧ ����һ����������
		//x = x + s; Ok
		s+=x; // һ������ �Զ��������ת��
		
		System.out.println(s);
		System.out.println(3 > 4); // �Ƚ������ ���ز������� true �� false
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