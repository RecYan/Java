package test;

import java.util.*;

/*
 
? 通配符。也可以理解为占位符。
泛型的限定；
？ extends E: 可以接收E类型或者E的子类型。上限。
？ super E: 可以接收E类型或者E的父类型。下限

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
		// TODO 自动生成的构造函数存根
	}
	
}
public class GenericTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//定义一个只存放Student类型的容器
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
	//? extends Person --存 Person或其子类类型
	public static void printColl(ArrayList<? extends Student> al) {
		Iterator<? extends Student> it = al.iterator();


		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
	}

}
