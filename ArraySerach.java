import java.util.*;
class ArraySerach
{
	public static void main(String[] args)
	{
		int[] arr ={1, 5, 9, 2, 4, 13}; 
		Arrays.sort(arr);
		printArray(arr);
		int index = serachIndex(arr, 5);
		System.out.println("arr.index = "+index);
//		printArray(arr);
		
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

	// 折半查找 
	public static int serachIndex(int[] arr, int key)
	{
		int min = 0;
		int max = arr.length-1;
		
		while (max >= min)
		{
			int mid = (min+max) / 2;
			
			if (key > arr[mid])
			{
				min = mid +1;
				//mid = (min+max) / 2;
			}
			else if (key < arr[mid])
			{
				max = mid - 1;
				//mid = (min+max) / 2;
			}
			else 
				return mid;	
		}	
		return -1; // 标识该数组中没有待查找的元素	
	}
}	