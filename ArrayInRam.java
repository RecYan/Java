/*
	提到数组 两个反应
	1 数组引用变量存在栈内存中
	2 数组元素本身存在堆内存中
	知道数组创建过程中 两块内存区域中具体的操作 
*/
class ArrayInRam
{
	public static void main(String[] args)
	{
		int[] a = new int[]{1, 2, 3, 4};
		int[] b = new int[]{5, 6, 7};
		
		System.out.println("a数组的长度为："+a.length);
		
		for (int c : a)
		{
			System.out.println(c);
		}
		a = b;
		System.out.println("a数组的长度为："+a.length);
		for (int d : a)
		{
			System.out.println(d);
		}
	}
}