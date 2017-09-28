import java.util.*;
class ArraySort
{
	public static void main(String[] args)
	{
		int[] arr = {3, 2, 5, 1, 43, 11};
		
		System.out.println("排序前的数组为：");
		// 排序前打印
		printArray(arr);
		System.out.println("----------------------");
		System.out.println("选择排序后的数组为：");
		// 排序
		selectSort(arr);
		// 排序后打印
		printArray(arr);
		System.out.println("----------------------");
		bubbleSort(arr);
		// 排序后打印
		System.out.println("冒泡排序后的数组为：");
		printArray(arr);
		System.out.println("----------------------");
		System.out.println("调用java排序后的数组为：");
		Arrays.sort(arr);
		printArray(arr);
	}
	public static void printArray(int[] arr)
	{
		int x;
		System.out.print("[ ");
		for (x=0; x<arr.length; x++)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.print(" ]");
		System.out.println();
	}
	/*
		封装方法
	*/
	
	// 选择排序
	public static void selectSort(int[] arr)
	{
		int x;
		int y;
		for (x=0; x<arr.length-1; x++)
		{
			for (y=x+1; y<arr.length; y++)
			{
				if (arr[x] > arr[y])
				{
					/*
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					*/
					swap(arr, x, y);
				}
			}
		}
	}
	// 冒泡排序
	public static void bubbleSort(int[] arr)
	{
		for (int x=0; x<arr.length-1; x++)
		{
			for (int y=0; y<arr.length-x-1; y++)
			{
				if (arr[y] > arr[y+1])
				{
					/*
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
					*/
					swap(arr, y, y+1);
				}
			}
		}
	}
	// 置换位置函数
	public static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}