class EqualTest
{
	public static void main(String[] args)
	{
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		// 使用 == 判断是只有两个引用类型变量都指向同一个对象时 才能想相等
		System.out.println(str1 == str2); 
		System.out.println(str1.equals(str2));	
	}
}