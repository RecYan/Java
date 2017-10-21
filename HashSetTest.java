package test;

import java.util.*;

/*
 
  Set:元素不可以重复，是无序(输入 输出 顺序不一致)。
	Set接口中的方法和Collection一致。
	|--HashSet: 内部数据结构是哈希表 ，是不同步的。
		如何保证该集合的元素唯一性呢？
			是通过对象的hashCode和equals方法来完成对象唯一性的。
			如果对象的hashCode值不同，那么不用判断equals方法，就直接存储到哈希表中。 
			如果对象的hashCode值相同，那么要再次判断对象的equals方法是否为true。
				如果为true，视为相同元素，不存。如果为false，那么视为不同元素，就进行存储。
		
		记住：如果元素要存储到HashSet集合中，必须覆盖hashCode方法和equals方法。
			一般情况下，如果定义的类会产生很多对象，比如人，学生，书，通常都需要覆盖equals，hashCode方法。
		建立对象判断是否相同的依据。
		
		
		
		
	|--TreeSet:可以对Set集合中的元素进行排序。是不同步的。 
				判断元素唯一性的方式：就是根据比较方法的返回结果是否是0，是0，就是相同元素，不存。 
				
				TreeSet对元素进行排序的方式一：
				让元素自身具备比较功能，元就需要实现Comparable接口。覆盖compareTo方法。
				
				如果不要按照对象中具备的自然顺序进行排序。如果对象中不具备自然顺序。怎么办？
				可以使用TreeSet集合第二种排序方式二：
				让集合自身具备比较功能，定义一个类实现Comparator接口，覆盖compare方法。
				将该类对象作为参数传递给TreeSet集合的构造函数。
				
				


if(this.hashCode()== obj.hashCode() && this.equals(obj))
哈希表确定元素是否相同
1，判断的是两个元素的哈希值是否相同。
	如果相同，在判断两个对象的内容是否相同。

2，判断哈希值相同，其实判断的是对象的hashCode的方法。判断内容相同，用的是equals方法。

注意：如果哈希值不同，是不需要判断equals。


---------------------------------例
往hashSet集合中存入自定对象
姓名和年龄相同为同一个人，重复元素。
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
	
	//复写Object类中的hashcode()方法 统一定义返回的哈希值
	public int hashCode() {
		System.out.println(this.name+".......hashcode");
		//同过比较不同元素的哈希值来第一步判定集合中的元素是否相同
		return name.hashCode() + age*27;
	}
	
	//复写Object类中的equals() 方法来自定义具有相同哈希值元素的比较方法
	public boolean equals(Object obj) {
		//父类引用指向自己 向下转型时 需要强制类型转换( instanceof )
		if (obj instanceof person) {
			person p = (person)obj;
			//判断是否调用equals
			System.out.println(p.name+"...equals.."+this.name);
			//当元素哈希值相同时 判断元素之间的姓名和年龄是否相同
			return this.name.equals(p.name) && this.age == p.age;
		}
		return false;
	}
}

public class HashSetTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet<person> hs = new HashSet<person>();
		//定义一个临时容器
		//ArrayList<Person> list = new ArrayList<Person>();
		
		//add(obj) 方法涉计多态问题
		//元素要存储到HashSet集合中，必须覆盖hashCode方法和equals方法。
		hs.add(new person("jack", 11));
		hs.add(new person("mike", 12));
		hs.add(new person("lucy", 13));
		hs.add(new person("mike", 12));
		
		
		//定义一个迭代器 遍历容器
		Iterator<person> it = hs.iterator();
		
		while (it.hasNext()) {
			//定义一个Object类型变量 存放迭代器的迭代值
			Object obj = it.next();
			
			// 将Obj 向下转型为person类型对象
			person p = (person) obj;
			System.out.println(p.getAge()+".........处理后........."+p.getName());
			
			/*
			if (list.contains(obj)) {
				// 将Obj 向下转型为person类型对象
				list.add((Person) obj);
				}
				*/
		}
		
	}

}

