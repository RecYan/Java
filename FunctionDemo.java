class FunctionDemo
{
	public static void main(String[] args)
	{
		getResult(4);
		int y = getResult(4);
		getMax(2, 3);
		draw(9, 9);
		Hr();
		getSum(3, 4);
		getSum(3, 4, 5);
		
		
		System.out.println("y = "+y);
		System.out.println("Max = "+getMax(2, 3));
		System.out.println("Sum Of Two = "+getSum(3, 4));
		System.out.println("Sum Of Three = "+getSum(3, 4, 5));
	}
	/*
	public static void getResult(int x) // ��������Ϊ void ʱ ����Ҫ return ���
	{
		System.out.println("num = "+(x*3+5)); // ���Ƽ� ���ܲ���һ
	}
	*/
	// 1 ��ȷ�������ؽ��
	// 2 ��ȷ�Ƿ��в����б� �Ƿ���λ�ò���
	public static int getResult(int x)
	{
		return x*3 + 5;
	}
	// ��ȷ�������岽��
	public static int getMax(int a, int b)
	{
		return (a>b)?a:b;
	}
	
	public static void draw(int row, int col)
	{
		for (int x=1; x<=row; x++)// ��������
		{
			for (int y=1; y<=col; y++)// ��������
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");//"\t"�Ʊ�� ������
			}
			System.out.println();	
		}
	}
	
	public static void Hr()
	{
		System.out.println("----------------------------");
		
	}
	// �������� �����б�ͬ������ 
	public static int getSum(int x, int y,int z)
	{
		//return x+y+z;
		return getSum(x, y)+z;// �Ƽ�
		
	}
	public static int getSum(int x, int y)
	{
		return x+y;
	}
}