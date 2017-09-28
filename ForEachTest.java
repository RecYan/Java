class ForEachTest
{
	public static void main(String[] args)
	{
		String[] names = new String[]{"zhangsan","lisi","wangerma"};
		
		for (String name : names)
		{
			// name 循环变量 相当于一个迭代容器 一般不对其赋初值
			/*
				name = "wangwu";
				error
			*/
			
			System.out.println(name);
		}
	}
}