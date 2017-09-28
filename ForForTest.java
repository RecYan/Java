/*
打印
*****
****
***
**
*

*/
class ForForTest
{
	public static void main(String[] args)
	{
		int x;
		int y;
		
		for (x=0; x<5; x++)// 控制行数
		{
			for (y=x; y<5; y++)// 控制列数
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		/*
			int z = 5;
			
			for (x=0; x<5; x++)// 控制行数
			{
				for (y=o; y<z; y++)// 控制列数
				{
					System.out.print("*");
				}
			System.out.println();
			z--;	
			}	
		*/
		System.out.println("------------------------");
		
		for (x=1; x<=5; x++)// 控制行数
		{
			for (y=1; y<=x; y++)// 控制列数
			{
				System.out.print(y);
			}
			System.out.println();	
		}
		System.out.println("------------------------");
		System.out.println("乘法表");
		for (x=1; x<=9; x++)// 控制行数
		{
			for (y=1; y<=x; y++)// 控制列数
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");//"\t"制表符 对齐用
			}
			System.out.println();	
		}
	}
}