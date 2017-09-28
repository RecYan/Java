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
	public static void getResult(int x) // 返回类型为 void 时 不需要 return 语句
	{
		System.out.println("num = "+(x*3+5)); // 不推荐 功能不单一
	}
	*/
	// 1 明确函数返回结果
	// 2 明确是否有参数列表 是否有位置参数
	public static int getResult(int x)
	{
		return x*3 + 5;
	}
	// 明确函数定义步骤
	public static int getMax(int a, int b)
	{
		return (a>b)?a:b;
	}
	
	public static void draw(int row, int col)
	{
		for (int x=1; x<=row; x++)// 控制行数
		{
			for (int y=1; y<=col; y++)// 控制列数
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");//"\t"制表符 对齐用
			}
			System.out.println();	
		}
	}
	
	public static void Hr()
	{
		System.out.println("----------------------------");
		
	}
	// 函数重载 参数列表不同来区分 
	public static int getSum(int x, int y,int z)
	{
		//return x+y+z;
		return getSum(x, y)+z;// 推荐
		
	}
	public static int getSum(int x, int y)
	{
		return x+y;
	}
}