import java.util.*;

class Person
{
	private int age;
	
	public Person(int age)
	{
		this.age = age;
	}
	
	public int setAge(int age)
	{
		return age;
	}
}

class FinalReferenceTest
{
	public static void main(String[] args)
	{
		final int[] arr = {20, 14, 13, 17};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		arr[2] = 5;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// final 修饰的引用型变量 不可以被再次赋值 但其指向的对象的内容是可以被改变的
		//arr = null;
		
	}
}