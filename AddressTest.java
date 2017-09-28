/*
	编写equals方法的建议:
显示参数命名为otherObject, 稍后转化成other变量
public boolean equals(Object otherObject)
检测this和otherObject是否是同一个对象的引用,是,返回true;
if(this==otherObject){
    return true;
}
检测otherObject是否为null, 是, 返回false;
if(otherObject == null){
    return false;
}
比较this和otherObject是否属于同一个类. 如果equals的语义在每个子类中有所改变,就使用getClass检测:
if(getClass() != otherObject.getClass()){
    return false;
}
如果所以子类语义相同,使用instanceof检测:
if(!(otherObject instanceof Employee)){
    return false;
}
将otherObject转化为相对应的类型变量other
Employee other = (Employee)otherObject;
对所需要的比较的数据域进行比较. 如果是基本数据类型,使用a==b比较; 如果是对象比较,调用Objects.equals(a, b)进行比较
return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
*/
import java.lang.*;
class Address
{
	private final String detail;
	private final String postCode;
	
	public Address()
	{
		this.detail = "";
		this.postCode = "";
	}
	public Address(String detail, String postCode)
	{
		this.detail = detail;
		this.postCode = postCode;
	}
	public String getDetail()
	{
		return detail;
	}
	public String getPostCode()
	{
		return postCode;
	}
	// 重写 equals 方法，判断两个对象是否相等
	public boolean equals(Object obj)
	{
		// 是否是同一个对象的引用
		if (this == obj)
		{
			return true;
		}
		if (obj != null && obj.getClass() == Address.class)
		{
			Address ad = (Address)obj;
			if (this.getDetail().equals(ad.getDetail()) && this.getPostCode().equals(ad.getPostCode()))
			{
				return true;
			}
		}
		return false;
	}
}
class AddressTest
{
	public static void main(String[] args)
	{
		Address ad1 = new Address();
		
		System.out.println(new Address().equals(ad1));
	}
}