class ArrayDemo2
{
	public static void main(String[] args)
	{	
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int[][] arr1 = new int[2][3]; // ������һ������Ϊarr�Ķ�ά���� ��ά��������3��һά���� ÿһ��һά��������4��Ԫ��
		System.out.println(arr1[0]); // [I@15db9742 ��ʾ��ӡ�˵�һ��һά������׵�ֵַ
		System.out.println(arr1[0][0]);// 0 ��ʾ��ӡ�˶�ά�����е�һ��Ԫ��ֵ
		
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