package test;

import java.util.*;

/*
 
  Set:Ԫ�ز������ظ���������(���� ��� ˳��һ��)��
	Set�ӿ��еķ�����Collectionһ�¡�
	|--HashSet: �ڲ����ݽṹ�ǹ�ϣ�� ���ǲ�ͬ���ġ�
		��α�֤�ü��ϵ�Ԫ��Ψһ���أ�
			��ͨ�������hashCode��equals��������ɶ���Ψһ�Եġ�
			��������hashCodeֵ��ͬ����ô�����ж�equals��������ֱ�Ӵ洢����ϣ���С� 
			��������hashCodeֵ��ͬ����ôҪ�ٴ��ж϶����equals�����Ƿ�Ϊtrue��
				���Ϊtrue����Ϊ��ͬԪ�أ����档���Ϊfalse����ô��Ϊ��ͬԪ�أ��ͽ��д洢��
		
		��ס�����Ԫ��Ҫ�洢��HashSet�����У����븲��hashCode������equals������
			һ������£����������������ܶ���󣬱����ˣ�ѧ�����飬ͨ������Ҫ����equals��hashCode������
		���������ж��Ƿ���ͬ�����ݡ�
		
		
		
		
	|--TreeSet:���Զ�Set�����е�Ԫ�ؽ��������ǲ�ͬ���ġ� 
				�ж�Ԫ��Ψһ�Եķ�ʽ�����Ǹ��ݱȽϷ����ķ��ؽ���Ƿ���0����0��������ͬԪ�أ����档 
				
				TreeSet��Ԫ�ؽ�������ķ�ʽһ��
				��Ԫ������߱��ȽϹ��ܣ�Ԫ����Ҫʵ��Comparable�ӿڡ�����compareTo������
				
				�����Ҫ���ն����о߱�����Ȼ˳�����������������в��߱���Ȼ˳����ô�죿
				����ʹ��TreeSet���ϵڶ�������ʽ����
				�ü�������߱��ȽϹ��ܣ�����һ����ʵ��Comparator�ӿڣ�����compare������
				�����������Ϊ�������ݸ�TreeSet���ϵĹ��캯����
				
				


if(this.hashCode()== obj.hashCode() && this.equals(obj))
��ϣ��ȷ��Ԫ���Ƿ���ͬ
1���жϵ�������Ԫ�صĹ�ϣֵ�Ƿ���ͬ��
	�����ͬ�����ж���������������Ƿ���ͬ��

2���жϹ�ϣֵ��ͬ����ʵ�жϵ��Ƕ����hashCode�ķ������ж�������ͬ���õ���equals������

ע�⣺�����ϣֵ��ͬ���ǲ���Ҫ�ж�equals��


---------------------------------��
��hashSet�����д����Զ�����
������������ͬΪͬһ���ˣ��ظ�Ԫ�ء�
*/
class person {
	private String name;
	private int age;
	
	person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//��дObject���е�hashcode()���� ͳһ���巵�صĹ�ϣֵ
	public int hashCode() {
		System.out.println(this.name+".......hashcode");
		//ͬ���Ƚϲ�ͬԪ�صĹ�ϣֵ����һ���ж������е�Ԫ���Ƿ���ͬ
		return name.hashCode() + age*27;
	}
	
	//��дObject���е�equals() �������Զ��������ͬ��ϣֵԪ�صıȽϷ���
	public boolean equals(Object obj) {
		//��������ָ���Լ� ����ת��ʱ ��Ҫǿ������ת��( instanceof )
		if (obj instanceof person) {
			person p = (person)obj;
			//�ж��Ƿ����equals
			System.out.println(p.name+"...equals.."+this.name);
			//��Ԫ�ع�ϣֵ��ͬʱ �ж�Ԫ��֮��������������Ƿ���ͬ
			return this.name.equals(p.name) && this.age == p.age;
		}
		return false;
	}
}

public class HashSetTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		HashSet<person> hs = new HashSet<person>();
		//����һ����ʱ����
		//ArrayList<Person> list = new ArrayList<Person>();
		
		//add(obj) ������ƶ�̬����
		//Ԫ��Ҫ�洢��HashSet�����У����븲��hashCode������equals������
		hs.add(new person("jack", 11));
		hs.add(new person("mike", 12));
		hs.add(new person("lucy", 13));
		hs.add(new person("mike", 12));
		
		
		//����һ�������� ��������
		Iterator<person> it = hs.iterator();
		
		while (it.hasNext()) {
			//����һ��Object���ͱ��� ��ŵ������ĵ���ֵ
			Object obj = it.next();
			
			// ��Obj ����ת��Ϊperson���Ͷ���
			person p = (person) obj;
			System.out.println(p.getAge()+".........�����........."+p.getName());
			
			/*
			if (list.contains(obj)) {
				// ��Obj ����ת��Ϊperson���Ͷ���
				list.add((Person) obj);
				}
				*/
		}
		
	}

}

