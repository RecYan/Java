package test;

import java.util.*;
import java.util.TreeSet;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����һ��ֻ���String���͵�����--������Ӧ�á�������ȫ����
		TreeSet<String> ts = new TreeSet<String>(new lenCompare());
		
		ts.add("ruby");
		ts.add("c#");
		ts.add("C++");
		ts.add("Python");
		
		//����һ��ֻ���String���͵ĵ�����--������Ӧ�á�
		Iterator<String> it = ts.iterator();
		
		//����������
		while (it.hasNext()) {
			//��Ϊǰ��ָ���˵��������Ԫ�ص����� �������ﲻ��Ҫ����������Ԫ�ؽ���ǿ��ת��
			System.out.println(it.next());
		}
	}
}

//comparator<String> ָ���ȽϽӿ�Ԫ�ص�����  ����Ԫ��ǿ��ת�͵��鷳
class lenCompare implements Comparator<String> {
	//��дcompare���� ��String�ĳ��ȱȽ�����
	@Override
	public int compare(String o1, String o2) {
		// TODO �Զ����ɵķ������
		int num = new Integer(o1.length()).compareTo(new Integer(o2.length()));
		
		return num;
	}
	
}
