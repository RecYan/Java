class ArrayDemo
{
	public static void main(String[] args)
	{
		/*
			引用数据类型的特点：两个数组指向同一个实体
		*/
		//int[] x = new int[3];//  X 为数组类型 其中存放的元素为 int 类型 数组大小为3 栈内存中存放数组首地址
		//int[] y = x;// 两个数组指向堆内存中的同一个实体
		//int[] y = new int[3]; 指向堆内存中的不同地址 相互之间没有引用
		//x = null 存在垃圾值
		//int[] z = {1, 2, 3, 4, 5};
		//int[] arr = new int[]{1, 2, 3, 4, 5};
		int[] arr ={1, 2, 3, 4, 5};
		//int sum = 0;
		
		//x[1] = 66;
		//x = null;// 因为存在引用数据类型 所以不存在垃圾值 虚拟机不触发垃圾回收机制
		printArr(arr);
		
		//System.out.println(y[1]);
		System.out.println("arr.length = "+arr.length);
		System.out.println("arr.sum = "+getSum(arr));
		System.out.println(arr);// [I@15db9742： [:数组 I: 元素类型为int @:分隔符 15db9742：数组首地址
		// 数组遍历 数组中获取数组长度的方法 【数组名.length】
		// 求和
		
		/*
		for (int t=0; t<arr.length; t++)
		{
			sum = sum + arr[t];
			System.out.println("arr["+t+"] = "+arr[t]);
		}
		System.out.println("arr.sum = "+sum);
		*/
		//x = null //x 不在指向数组
		//System.out.println(x[1]);// NullPointerException 空指针异常
		//System.out.println(z[0]);
		//System.out.println(z[5]); 定义数组 直接分配元素 系统自动确定该数组边界
	}
	// 封装成遍历函数
	public static void printArr(int[] arr)
	{
		for (int t=0; t<arr.length; t++)
		{
			System.out.println("arr["+t+"] = "+arr[t]);	
		}	
	}
	// 封装成求和函数
	public static int getSum(int[] arr)
	{
		int sum = 0;
		for (int t=0; t<arr.length; t++)
		{
			 sum = sum + arr[t];
		}
		return sum;	
	}
}