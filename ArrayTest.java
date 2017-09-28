class ArrayTest
{
	public static int getMax(int[] arr)
	{
		int max = arr[0];
		
		for (int x=0; x<arr.length; x++)
		{
			if (arr[x] > max)
			{
				max = arr[x];
			}
		}
		return max;
	}
	// ����ʵ�� ��ͬ���������������ֵ����
	/*
	public static double getMax(double[] arr) ʹ�ú�������ʵ�� ������ͬ  
	*/
	// ʹ���±�Ƚ�
	public static int getMax_1(int[] arr)
	{
		int max = 0; // ����Ϊ�������Ԫ�صĽǱ�
		
		for (int x=0; x<arr.length; x++)
		{
			if (arr[x] > arr[max])
			{
				max = x; // �����ֵ�ĽǱ긳��max
			}
		}
		return arr[max];
	}
	public static void main(String[] args)
	{
		int[] arr = {1, 2, 55, 78, -12, 23};
		System.out.println("arr.max = "+getMax(arr));
		System.out.println("-------------------------");
		System.out.println("arr.max = "+getMax_1(arr));
	}
}