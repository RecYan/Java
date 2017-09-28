/*
	二维数组 实质上就是一维数组
	int[][] a = new int[3][4]   实际就是3个一维数组 其中每个数组元素又是一个一维数组 长度为4 类型为 int
*/
class TwoDimensionTest
{
	public static void main(String[] args)
	{
		int[][] a = new int[4][];
		
		a[0] = new int[2];
		a[0][1] = 4;
		
		for (int i=0; i<a[0].length; i++)
		{
			System.out.println(a[0][i]);
		}
		
	}
}