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
	// 重载实现 不同数据类型数组的最值运算
	/*
	public static double getMax(double[] arr) 使用函数重载实现 功能相同  
	*/
	// 使用下标比较
	public static int getMax_1(int[] arr)
	{
		int max = 0; // 定义为数组初试元素的角标
		
		for (int x=0; x<arr.length; x++)
		{
			if (arr[x] > arr[max])
			{
				max = x; // 将最大值的角标赋给max
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