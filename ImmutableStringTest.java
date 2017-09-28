import java.lang.String;
class ImmutableStringTest
{
	public static void main(String[] args)
	{
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashcode());
		//System.out.println(str2.hashcode());
		
	}
}