/*
abstract class AbsDemo
{
	abstract void show1();
	abstract void show2();
}

��һ���������еķ������ǳ����ʱ����ʱ���Խ��ó�������
��һ����ʽ����ͱ�ʾ������ �ӿ� interface��
*/

//����ӿ�ʹ�õĹؼ��ֲ���class����interface.
/*
���ڽӿڵ��г����ĳ�Ա��������Щ��Ա���й̶������η���
1��ȫ�ֳ���: public  static final 

2�����󷽷���public abstract 

�ɴ˵ó����ۣ��ӿ��еĳ�Ա���ǹ�����Ȩ��.
*/
interface Demo
{
	public static final int NUM = 4;

	public abstract void show1();
	public abstract void show2();
}
//������֮���Ǽ̳й�ϵ������ӿ�ֱ����ʵ�ֹ�ϵ�� 
/*
�ӿڲ�����ʵ������

ֻ����ʵ���˽ӿڵ����ಢ�����˽ӿ������еĳ��󷽷��󣬸�����ſ���ʵ������
��������������һ�������ࡣ

*/
class DemoImpl implements /*ʵ��*/Demo
{
	public void show1()
	{}

	public void show2()
	{
	
	}
}
/*
��java�в�ֱ��֧�ֶ�̳У���Ϊ����ֵ��õĲ�ȷ���ԡ�
����java����̳л��ƽ��и�������java�б���˶�ʵ�֡�

һ�������ʵ�ֶ���ӿڡ� 

*/
interface A
{
	public void show();
}
interface Z
{
	public int add(int a,int b);
}
class Test implements A,Z//��ʵ��
{
	
	public int add(int a,int b)
	{
		return a+b+3;	
	}
	/**/
	public void show(){}
}
/*
һ�����ڼ̳���һ�����ͬʱ��������ʵ�ֶ���ӿڡ�



*/
class Q
{
	public void method()
	{}
}

abstract class Test2 extends Q implements A,Z
{

}
/*
�ӿڵĳ��ֱ����˵��̳еľ����ԡ�

*/


interface CC
{
	void show();
}
interface MM
{
	void method();
}

interface QQ extends  CC,MM//�ӿ���ӿ�֮���Ǽ̳й�ϵ�����ҽӿڿ��Զ�̳С� 
{
	void function();
}

class WW implements QQ
{
//����3��������
	public void show(){}
	public void method(){}
	public void function(){}
}


class Interface 
{
	public static void main(String[] args) 
	{

		Test t = new Test();
		t.show();

//		DemoImpl d = new DemoImpl();	
//		System.out.println(d.NUM);
//		System.out.println(DemoImpl.NUM);
//		System.out.println(Demo.NUM);
	}
}
/*
----------------------------------------------------------------------------
*/

/*
������ͽӿڵ���ͬ�㣺
��ͬ�㣺
	���ǲ������ϳ�ȡ�����ġ�
��ͬ�㣺
	1����������Ҫ���̳У�����ֻ�ܵ��̳С�
	   �ӿ���Ҫ��ʵ�֣����ҿ��Զ�ʵ�֡� 
	2���������п��Զ�����󷽷��ͷǳ��󷽷�������̳к󣬿���ֱ��ʹ�÷ǳ��󷽷���
	   �ӿ���ֻ�ܶ�����󷽷�������������ȥʵ�֡� 
	3��������ļ̳У���is a��ϵ���ڶ������ϵ�Ļ����������ݡ�
	   �ӿڵ�ʵ���� like a ��ϵ���ڶ�����ϵ���⹦�ܡ�

Ȯ�����ܷ֣��е�äȮ���ѱ�Ȯ��
abstract class Ȯ
{
	abstract void ���();
}
//abstract class ��ä
interface ��ä
{
	abstract void ��ä();
}
class ��äȮ extends Ȯ implements ��ä
{
	public void ���()
	{
	}
	public void ��ä(){}
}
//�ڲ�ͬ�����������У��в�ͬ�ķ�����ʽ��
ѧԱ��
	ѧϰ��
	����ѧԱ
����
	
*/
class InterfaceDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}



