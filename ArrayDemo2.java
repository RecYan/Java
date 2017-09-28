class ArrayDemo2
{
	public static void main(String[] args)
	{	
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int[][] arr1 = new int[2][3]; // 定义了一个名称为arr的二维数组 二维数组中有3个一维数组 每一个一维数组中有4个元素
		System.out.println(arr1[0]); // [I@15db9742 表示打印了第一个一维数组的首地址值
		System.out.println(arr1[0][0]);// 0 表示打印了二维数组中第一个元素值
		
		int[][] arr2 = new int[2][];
		arr2[0] = new int[2];
		arr2[1] = new int[4];
		
		int sum = 0;
		for ( int x=0; x<arr.length; x++)
		{
			for( int y=0; y<arr[x].length; y++)
			{
				//System.out.println(arr[x][y]);
				sum = sum + arr[x][y];
			}
			//System.out.println(sum);
		}
		System.out.println(sum);	
	}
}