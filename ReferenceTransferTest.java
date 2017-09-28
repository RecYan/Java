class DataWrap
{
	int a;
	int b;
}
class ReferenceTransferTest
{
	public void Swap(DataWrap dw)
	{
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		
		System.out.println("Swap中....a = "+dw.a+" | Swap中....b = "+dw.b);
	}
	public static void main(String[] args)
	{
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 9;
		new ReferenceTransferTest().Swap(dw);
		// Swap(dw) 只要在方法前 使用static修饰 就可以直接条用该方法
		System.out.println("交换结束后....a = "+dw.a+" | 交换结束后....b = "+dw.b);
	}
}
/*
	引用类型参数传递 实际为多个引用指向同一个对象 再进行操作 所以交换中 交换后的值都变化 、
	区分于一般类型的参数传递
	
	值传递 实际为副本(复制品)传递

	创建对象 内存中的操作 一定有两个区域 其其中 该对象的引用存在于 栈内存 中 对象实体存在于 堆内存 中 	
*/