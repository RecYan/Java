//  ����������������� ��װ�� �̳У� ��̬��
/*
	�� ����ʵ���������������
	���� ������������ ʵʵ���ڴ��ڵĸ���

*/
/*
���ڴ��е�λ�ã�
��Ա����: �ڶ��ڴ��У���Ϊ����Ĵ��ڣ������ڴ��д���
�ֲ������� ������ջ�ڴ���
*/
class objectDemo
{
	public static void main(String[] args)
	{
		System.out.println();
		Car c = new Car();// ����һ���� ���ͱ��� ָ����󣨸����в�����ʵ�壩
//		c.colour = "blue";	
//		c.run();
		showCar(c);
//		showCar(new Car()); // ����������Ϊ��������
	}
	public static void showCar(Car c)
	{
		c.num = 3;
		c.colour = "black";
		c.run();
	}
}

//���Զ�Ӧ���еı��� ��Ϊ��Ӧ���еĺ��� 
//������ ���Ƕ������Ժ���Ϊ ����Ա���� ��Ա������
class Car
{
	// ������ɫ
	String colour = "red";
	// ������̥��
	int num = 4;

	// ������Ϊ
	void run()
	{
		System.out.println("��ɫ��"+colour+"    "+"��̥��: "+num);
	}
}
