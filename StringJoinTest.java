class StringJoinTest
{
	public static void main(String[] args)
	{
		String str1 = "1234";
		String str2  = "12"+"34";
		
		System.out.println(str1 == str2);
		// 加上final 修饰 变成宏变量 则返回 true
		 String str3 = "12";
		 String str4 = "34";
		String str5 = str3 + str4;
		
		System.out.println(str5 == str1);
	}
}