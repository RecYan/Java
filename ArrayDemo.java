class ArrayDemo
{
	public static void main(String[] args)
	{
		/*
			�����������͵��ص㣺��������ָ��ͬһ��ʵ��
		*/
		//int[] x = new int[3];//  X Ϊ�������� ���д�ŵ�Ԫ��Ϊ int ���� �����СΪ3 ջ�ڴ��д�������׵�ַ
		//int[] y = x;// ��������ָ����ڴ��е�ͬһ��ʵ��
		//int[] y = new int[3]; ָ����ڴ��еĲ�ͬ��ַ �໥֮��û������
		//x = null ��������ֵ
		//int[] z = {1, 2, 3, 4, 5};
		//int[] arr = new int[]{1, 2, 3, 4, 5};
		int[] arr ={1, 2, 3, 4, 5};
		//int sum = 0;
		
		//x[1] = 66;
		//x = null;// ��Ϊ���������������� ���Բ���������ֵ ������������������ջ���
		printArr(arr);
		
		//System.out.println(y[1]);
		System.out.println("arr.length = "+arr.length);
		System.out.println("arr.sum = "+getSum(arr));
		System.out.println(arr);// [I@15db9742�� [:���� I: Ԫ������Ϊint @:�ָ��� 15db9742�������׵�ַ
		// ������� �����л�ȡ���鳤�ȵķ��� ��������.length��
		// ���
		
		/*
		for (int t=0; t<arr.length; t++)
		{
			sum = sum + arr[t];
			System.out.println("arr["+t+"] = "+arr[t]);
		}
		System.out.println("arr.sum = "+sum);
		*/
		//x = null //x ����ָ������
		//System.out.println(x[1]);// NullPointerException ��ָ���쳣
		//System.out.println(z[0]);
		//System.out.println(z[5]); �������� ֱ�ӷ���Ԫ�� ϵͳ�Զ�ȷ��������߽�
	}
	// ��װ�ɱ�������
	public static void printArr(int[] arr)
	{
		for (int t=0; t<arr.length; t++)
		{
			System.out.println("arr["+t+"] = "+arr[t]);	
		}	
	}
	// ��װ����ͺ���
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