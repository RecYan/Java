class ForTest
{
	public static void main(String[] args)
	{
		int x;
		int sum = 0;
		int count = 0;
		
		for (x=1; x<=100; x++)
		{
			if (x%7 == 0)
			{
				System.out.println("x = "+x);
				count++;
			}
		}
		System.out.println("count = "+count);	
	}
}