/*
���ģʽ����������֮��Ч�Ľ����ʽ����ʵ����һ��˼�롣

1,�������ģʽ��
	��������⣺���ǿ��Ա�֤һ�������ڴ��еĶ���Ψһ�ԡ�

������ڶ������ʹ��ͬһ��������Ϣ����ʱ������Ҫ��֤�ö����Ψһ�ԡ�

��α�֤����Ψһ���أ�
1������������������new�����������
2���ڸ��ഴ��һ������ʵ����
3�������ṩһ������������������Ի�ȡ�ö���

���裺
1��˽�л����๹�캯����
2��ͨ��new�ڱ����д���һ���������
3������һ�����еķ������������Ķ��󷵻ء�

*/
class single
{
	private int num;
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return num;
	}
	//------------------
	private single()// ��֤���������� ֻ��ͨ���������� ����Ψһ
	{
	
	}
	private static single s = new single();
	public static single getInstance()// static���� ���Ա�֤�������� �� ��̬���� ֻ�ܴ���̬����
	{
		return s;
	}
	//------------------------
}
class singleDemo
{
	public static void main(String[] args)
	{
		single s1 = single.getInstance();// û�ж��� ֻ��ͨ����������
		single s2 = single.getInstance();
		s1.setNum(20);
		System.out.println("s1.num = "+s1.getNum());
		System.out.println("s2.num = "+s2.getNum());
	}
}