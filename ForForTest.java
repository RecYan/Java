/*
��ӡ
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
		
		for (x=0; x<5; x++)// ��������
		{
			for (y=x; y<5; y++)// ��������
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		/*
			int z = 5;
			
			for (x=0; x<5; x++)// ��������
			{
				for (y=o; y<z; y++)// ��������
				{
					System.out.print("*");
				}
			System.out.println();
			z--;	
			}	
		*/
		System.out.println("------------------------");
		
		for (x=1; x<=5; x++)// ��������
		{
			for (y=1; y<=x; y++)// ��������
			{
				System.out.print(y);
			}
			System.out.println();	
		}
		System.out.println("------------------------");
		System.out.println("�˷���");
		for (x=1; x<=9; x++)// ��������
		{
			for (y=1; y<=x; y++)// ��������
			{
				System.out.print(y+"*"+x+"="+y*x+"\t");//"\t"�Ʊ�� ������
			}
			System.out.println();	
		}
	}
}