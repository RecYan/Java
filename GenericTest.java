package test;

import java.util.*;

/*
 
? ͨ�����Ҳ�������Ϊռλ����
���͵��޶���
�� extends E: ���Խ���E���ͻ���E�������͡����ޡ�
�� super E: ���Խ���E���ͻ���E�ĸ����͡�����

*/
class Student {
	private String name;
	private int age;
	
	Student(String name, int age) {
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
}
class Prostudent extends Student {

	Prostudent(String name, int age) {
		super(name, age);
		// TODO �Զ����ɵĹ��캯�����
	}
	
}
public class GenericTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����һ��ֻ���Student���͵�����
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("mike", 22));
		al.add(new Student("lucy", 23));
		al.add(new Student("jack", 24));
		printColl(al);
		
		ArrayList<Prostudent> al_p = new ArrayList<Prostudent>();
		al_p.add(new Prostudent("P_mike", 22));
		al_p.add(new Prostudent("P_lucy", 23));
		al_p.add(new Prostudent("P_jack", 24));
		printColl(al_p);

	}
	//? extends Person --�� Person������������
	public static void printColl(ArrayList<? extends Student> al) {
		Iterator<? extends Student> it = al.iterator();


		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}

}
