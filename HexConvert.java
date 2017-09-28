class HexConvert
{
	public static void main(String[] args)
	{
		//toBinary(6);
		//toHex(60);
		toHex_1(60);
	}
	// 十进制转二进制
	public static void toBinary(int num)
	{
		StringBuffer sb = new StringBuffer(); // 定义一个存放数据的容器
		while (num > 0)
		{
			sb.append(num%2); // sb容器 append 添加方法
			num = num/2;
		}
		System.out.println(sb.reverse()); // sb容器 内容反向输出
	}
	// 十进制转十六进制
	public static void toHex(int num)
	{
		StringBuffer sb = new StringBuffer(); // 定义一个存放数据的容器
		for (int x=0; x<8; x++)
		{
			int temp = num & 15; // 取最后4位的二进制形式
			// System.out.println(temp);
			if (temp < 9)
				//System.out.println(temp);
				sb.append(temp);
			else 
				// System.out.println((char)(temp-10 + 'A')); // temp-10 + 'A' 转字符
				sb.append((char)(temp-10 + 'A'));
			num = num >>> 4; // 右移4位
		}
		System.out.println(sb.reverse()); // sb容器 内容反向输出	
	}
	// 使用数组下标实现对应字符 不用进行转换运算
	public static void toHex_1(int num)
	{
		// 定义一个字母表
		char[] ch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		// 定义一个数组容器
		char[] arr = new char[8];
		int pos = arr.length-1; // 定义一个指针
		
		while (num != 0)
		{
			int temp = num & 15;
			
			arr[pos] = ch[temp]; // 从数组容器后面开始存
			pos--;
			num = num >>> 4;	
		}
		for (int x=pos+1; x<arr.length; x++)
		{
			System.out.print(arr[x]);
		}
		System.out.println();
	}
}