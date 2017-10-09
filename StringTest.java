
package com.JavaeeExcl.www;

/*
String类适用于描述字符串事物。
常见的操作有

1，获取。
	1.1 字符串中的包含的字符数，也就是字符串的长度。
		int length():获取长度。
	1.2 根据位置获取位置上某个字符。
		char charAt(int index):
	1.3 根据字符获取该字符在字符串中位置。
		int indexOf(int ch):返回的是ch在字符串中第一次出现的位置。
		int indexOf(int ch, int fromIndex) :从fromIndex指定位置开始，获取ch在字符串中出现的位置。

		int indexOf(String str):返回的是str在字符串中第一次出现的位置。
		int indexOf(String str, int fromIndex) :从fromIndex指定位置开始，获取str在字符串中出现的位置。

2，判断。
	2.1 字符串中是否包含某一个子串。
		boolean contains(str):
		特殊之处：indexOf(str):可以索引str第一次出现位置，如果返回-1.表示该str不在字符串中存在。
				所以，也可以用于对指定判断是否包含。
				if(str.indexOf("aa")!=-1)

				而且该方法即可以判断，有可以获取出现的位置。

	2.2 字符中是否有内容。
		boolean isEmpty(): 原理就是判断长度是否为0. 
	2.3 字符串是否是以指定内容开头。
		boolean startsWith(str);
	2.4 字符串是否是以指定内容结尾。
		boolean endsWith(str);
	2.5 判断字符串内容是否相同。复写了Object类中的equals方法。
		boolean equals(str);
	2.6 判断内容是否相同，并忽略大小写。
		boolean equalsIgnoreCase();
	
3，转换。
	3.1 将字符数组转成字符串。
		构造函数：String(char[])
				  String(char[],int offset,int count):将字符数组中的一部分转成字符串。

		静态方法：
				static String copyValueOf(char[]);
				static String copyValueOf(char[] data, int offset, int count) 

				static String valueOf(char[]):

		
	3.2 将字符串转成字符数组。**
		char[] toCharArray():

	3.3 将字节数组转成字符串。
			String(byte[])
			String(byte[],offset,count):将字节数组中的一部分转成字符串。

	3.4 将字符串转成字节数组。
			byte[]  getBytes():
	3.5 将基本数据类型转成字符串。
		static String valueOf(int)
		static String valueOf(double)

		//3+"";//String.valueOf(3);

		特殊：字符串和字节数组在转换过程中，是可以指定编码表的。

4，替换
	String replace(oldchar,newchar);

5，切割
	// 切割指定内容 获取需要的部分
	String[] split(regex);

6，子串。获取字符串中的一部分。
	String substring(begin);
	// 只获取到end前面一个位置
	String substring(begin,end);
	// 获取从begin到end位置的子串
	String subString(begin,end+1);

7，转换，去除空格，比较。
	7.1 将字符串转成大写或则小写。
		 String toUpperCase();
		 String toLowerCase();

	7.2 将字符串两端的多个空格去除。
		String trim();

	7.3 对两个字符串进行自然顺序的比较。
		int compareTo(string);
*/

class StringTool{
/*
 	设计一个trim方法，去除字符串两端的空格。
		思路：
			判断字符串第一个位置是否是空格，如果是继续向下判断，直到不是空格为止。
			结尾处判断空格也是如此。
			当开始和结尾都判断到不是空格时，就是要获取的字符串。
*/
	public void mytrim(String str){
		System.out.println("去除字符串两端的空格");
		
		int begain = 0;
		
		// 获取字符串最后一个角标数
		int end = str.length()-1;
		
		// 循环判断字符串前面是否为空格
		while (str.charAt(begain)==' ' && begain<=end ){
			begain++;
		}
		
		// 循环判断字符串结尾是否为空格
		while (str.charAt(end)==' ' && begain<=end ){
			end--;
		}
		System.out.println("处理前： "+"("+str+")");
		
		// 获取需要的子串 并打印出来
		System.out.println("处理后： "+"("+str.substring(begain,end+1)+")");
	}
//--------------------------------------------------------------------------------------------------
/*
 	将一个字符串进行反转。将字符串中指定部分进行反转
		思路：
			
			将字符串变成字符数组。
			对字符数组反转。
			将反转后的字符数组变成字符串。		
*/	
	public void reverseString(String str){
		System.out.println( "将一个字符串进行反转");
		// 将字符串转换为字符数组
		char[] ch = str.toCharArray();
		
		// 对整个字符数组进行反转
		reverse(ch, 0, ch.length-1);
		
		System.out.println("处理前： "+"("+str+")");
		
		// 将字符数组转换为字符串并打印出来
		System.out.println("处理后： "+"("+new String(ch)+")");
	}
	
	//反转字符数组 可以指定具体角标位置反转
	public void reverse(char[] ch, int x, int y){
		for (int begain=x,end=y; begain<end; begain++,end--)
		{
			char temp = ch[begain];
			 ch[begain] = ch[end];
			 ch[end] = temp;
		}
	}
//--------------------------------------------------------------------------------------------------
/*
	获取一个子字符串kk在本字符串中出现的次数。
	"abkkcdkkefkkskk"
		思路：
			定义个计数器。
			获取kk第一次出现的位置。
			从第一次出现位置后剩余的字符串中继续获取kk出现的位置， 每获取一次就计数一次。
			当获取不到时，计数完成。
*/
	public void getKeyCount(String str, String key){
		System.out.println( "获取一个字符串在另一个字符串中出现的次数");
		
		// 计数器清零
		int count = 0;
		
		// 设置初始角标位
		int index = 0;
		
		// str.indexOf(key,index)--从index位置查找需要的key
		// index不等于-1 --说明该key在本串中
		while ((index= str.indexOf(key,index))!=-1){
			index = index + key.length();
			count++;
		}
		System.out.println("处理前： "+"("+str+")");
		
		// 打印输出结果
		System.out.println("处理后： "+"kk在本字符串中出现的次数为： "+count);
	}
//--------------------------------------------------------------------------------------------------
}

public class StringTest {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "   asd--ght     ";
		String s1 = "abkkcdkkefkkskk";
		String key = "kk";
		
		StringTool st = new StringTool();
		st.mytrim(s);
		st.reverseString(s);
		st.getKeyCount(s1, key);
	}

}
