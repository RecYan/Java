class HexConvert
{
	public static void main(String[] args)
	{
		//toBinary(6);
		//toHex(60);
		toHex_1(60);
	}
	// ʮ����ת������
	public static void toBinary(int num)
	{
		StringBuffer sb = new StringBuffer(); // ����һ��������ݵ�����
		while (num > 0)
		{
			sb.append(num%2); // sb���� append ��ӷ���
			num = num/2;
		}
		System.out.println(sb.reverse()); // sb���� ���ݷ������
	}
	// ʮ����תʮ������
	public static void toHex(int num)
	{
		StringBuffer sb = new StringBuffer(); // ����һ��������ݵ�����
		for (int x=0; x<8; x++)
		{
			int temp = num & 15; // ȡ���4λ�Ķ�������ʽ
			// System.out.println(temp);
			if (temp < 9)
				//System.out.println(temp);
				sb.append(temp);
			else 
				// System.out.println((char)(temp-10 + 'A')); // temp-10 + 'A' ת�ַ�
				sb.append((char)(temp-10 + 'A'));
			num = num >>> 4; // ����4λ
		}
		System.out.println(sb.reverse()); // sb���� ���ݷ������	
	}
	// ʹ�������±�ʵ�ֶ�Ӧ�ַ� ���ý���ת������
	public static void toHex_1(int num)
	{
		// ����һ����ĸ��
		char[] ch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		// ����һ����������
		char[] arr = new char[8];
		int pos = arr.length-1; // ����һ��ָ��
		
		while (num != 0)
		{
			int temp = num & 15;
			
			arr[pos] = ch[temp]; // �������������濪ʼ��
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