
package com.JavaeeExcl.www;

/*
String�������������ַ������
�����Ĳ�����

1����ȡ��
	1.1 �ַ����еİ������ַ�����Ҳ�����ַ����ĳ��ȡ�
		int length():��ȡ���ȡ�
	1.2 ����λ�û�ȡλ����ĳ���ַ���
		char charAt(int index):
	1.3 �����ַ���ȡ���ַ����ַ�����λ�á�
		int indexOf(int ch):���ص���ch���ַ����е�һ�γ��ֵ�λ�á�
		int indexOf(int ch, int fromIndex) :��fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����г��ֵ�λ�á�

		int indexOf(String str):���ص���str���ַ����е�һ�γ��ֵ�λ�á�
		int indexOf(String str, int fromIndex) :��fromIndexָ��λ�ÿ�ʼ����ȡstr���ַ����г��ֵ�λ�á�

2���жϡ�
	2.1 �ַ������Ƿ����ĳһ���Ӵ���
		boolean contains(str):
		����֮����indexOf(str):��������str��һ�γ���λ�ã��������-1.��ʾ��str�����ַ����д��ڡ�
				���ԣ�Ҳ�������ڶ�ָ���ж��Ƿ������
				if(str.indexOf("aa")!=-1)

				���Ҹ÷����������жϣ��п��Ի�ȡ���ֵ�λ�á�

	2.2 �ַ����Ƿ������ݡ�
		boolean isEmpty(): ԭ������жϳ����Ƿ�Ϊ0. 
	2.3 �ַ����Ƿ�����ָ�����ݿ�ͷ��
		boolean startsWith(str);
	2.4 �ַ����Ƿ�����ָ�����ݽ�β��
		boolean endsWith(str);
	2.5 �ж��ַ��������Ƿ���ͬ����д��Object���е�equals������
		boolean equals(str);
	2.6 �ж������Ƿ���ͬ�������Դ�Сд��
		boolean equalsIgnoreCase();
	
3��ת����
	3.1 ���ַ�����ת���ַ�����
		���캯����String(char[])
				  String(char[],int offset,int count):���ַ������е�һ����ת���ַ�����

		��̬������
				static String copyValueOf(char[]);
				static String copyValueOf(char[] data, int offset, int count) 

				static String valueOf(char[]):

		
	3.2 ���ַ���ת���ַ����顣**
		char[] toCharArray():

	3.3 ���ֽ�����ת���ַ�����
			String(byte[])
			String(byte[],offset,count):���ֽ������е�һ����ת���ַ�����

	3.4 ���ַ���ת���ֽ����顣
			byte[]  getBytes():
	3.5 ��������������ת���ַ�����
		static String valueOf(int)
		static String valueOf(double)

		//3+"";//String.valueOf(3);

		���⣺�ַ������ֽ�������ת�������У��ǿ���ָ�������ġ�

4���滻
	String replace(oldchar,newchar);

5���и�
	// �и�ָ������ ��ȡ��Ҫ�Ĳ���
	String[] split(regex);

6���Ӵ�����ȡ�ַ����е�һ���֡�
	String substring(begin);
	// ֻ��ȡ��endǰ��һ��λ��
	String substring(begin,end);
	// ��ȡ��begin��endλ�õ��Ӵ�
	String subString(begin,end+1);

7��ת����ȥ���ո񣬱Ƚϡ�
	7.1 ���ַ���ת�ɴ�д����Сд��
		 String toUpperCase();
		 String toLowerCase();

	7.2 ���ַ������˵Ķ���ո�ȥ����
		String trim();

	7.3 �������ַ���������Ȼ˳��ıȽϡ�
		int compareTo(string);
*/

class StringTool{
/*
 	���һ��trim������ȥ���ַ������˵Ŀո�
		˼·��
			�ж��ַ�����һ��λ���Ƿ��ǿո�����Ǽ��������жϣ�ֱ�����ǿո�Ϊֹ��
			��β���жϿո�Ҳ����ˡ�
			����ʼ�ͽ�β���жϵ����ǿո�ʱ������Ҫ��ȡ���ַ�����
*/
	public void mytrim(String str){
		System.out.println("ȥ���ַ������˵Ŀո�");
		
		int begain = 0;
		
		// ��ȡ�ַ������һ���Ǳ���
		int end = str.length()-1;
		
		// ѭ���ж��ַ���ǰ���Ƿ�Ϊ�ո�
		while (str.charAt(begain)==' ' && begain<=end ){
			begain++;
		}
		
		// ѭ���ж��ַ�����β�Ƿ�Ϊ�ո�
		while (str.charAt(end)==' ' && begain<=end ){
			end--;
		}
		System.out.println("����ǰ�� "+"("+str+")");
		
		// ��ȡ��Ҫ���Ӵ� ����ӡ����
		System.out.println("����� "+"("+str.substring(begain,end+1)+")");
	}
//--------------------------------------------------------------------------------------------------
/*
 	��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת
		˼·��
			
			���ַ�������ַ����顣
			���ַ����鷴ת��
			����ת����ַ��������ַ�����		
*/	
	public void reverseString(String str){
		System.out.println( "��һ���ַ������з�ת");
		// ���ַ���ת��Ϊ�ַ�����
		char[] ch = str.toCharArray();
		
		// �������ַ�������з�ת
		reverse(ch, 0, ch.length-1);
		
		System.out.println("����ǰ�� "+"("+str+")");
		
		// ���ַ�����ת��Ϊ�ַ�������ӡ����
		System.out.println("����� "+"("+new String(ch)+")");
	}
	
	//��ת�ַ����� ����ָ������Ǳ�λ�÷�ת
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
	��ȡһ�����ַ���kk�ڱ��ַ����г��ֵĴ�����
	"abkkcdkkefkkskk"
		˼·��
			�������������
			��ȡkk��һ�γ��ֵ�λ�á�
			�ӵ�һ�γ���λ�ú�ʣ����ַ����м�����ȡkk���ֵ�λ�ã� ÿ��ȡһ�ξͼ���һ�Ρ�
			����ȡ����ʱ��������ɡ�
*/
	public void getKeyCount(String str, String key){
		System.out.println( "��ȡһ���ַ�������һ���ַ����г��ֵĴ���");
		
		// ����������
		int count = 0;
		
		// ���ó�ʼ�Ǳ�λ
		int index = 0;
		
		// str.indexOf(key,index)--��indexλ�ò�����Ҫ��key
		// index������-1 --˵����key�ڱ�����
		while ((index= str.indexOf(key,index))!=-1){
			index = index + key.length();
			count++;
		}
		System.out.println("����ǰ�� "+"("+str+")");
		
		// ��ӡ������
		System.out.println("����� "+"kk�ڱ��ַ����г��ֵĴ���Ϊ�� "+count);
	}
//--------------------------------------------------------------------------------------------------
}

public class StringTest {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s = "   asd--ght     ";
		String s1 = "abkkcdkkefkkskk";
		String key = "kk";
		
		StringTool st = new StringTool();
		st.mytrim(s);
		st.reverseString(s);
		st.getKeyCount(s1, key);
	}

}
