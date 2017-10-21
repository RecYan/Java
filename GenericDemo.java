package test;

import java.util.*;
import java.util.TreeSet;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//定义一个只存放String类型的容器--【泛型应用】消除安全警告
		TreeSet<String> ts = new TreeSet<String>(new lenCompare());
		
		ts.add("ruby");
		ts.add("c#");
		ts.add("C++");
		ts.add("Python");
		
		//定义一个只存放String类型的迭代器--【泛型应用】
		Iterator<String> it = ts.iterator();
		
		//遍历迭代器
		while (it.hasNext()) {
			//因为前面指定了迭代器存放元素的类型 所以这里不需要将迭代器的元素进行强制转换
			System.out.println(it.next());
		}
	}
}

//comparator<String> 指定比较接口元素的类型  避免元素强制转型的麻烦
class lenCompare implements Comparator<String> {
	//复写compare方法 按String的长度比较排序
	@Override
	public int compare(String o1, String o2) {
		// TODO 自动生成的方法存根
		int num = new Integer(o1.length()).compareTo(new Integer(o2.length()));
		
		return num;
	}
	
}
