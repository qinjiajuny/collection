package collection;

import java.util.LinkedList;

class Person{
	
	String name;
	
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override 
	public String toString() {
		return "{ 名字："+ this.name+" 年龄："+ this.age+"}";
	}
	
}
	
public class ListTest2 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Person("狗娃", 7));
		list.add(new Person("狗剩", 17));
		list.add(new Person("铁蛋", 3));
		list.add(new Person("美美", 30));
		
		//编写一个函数根据人的年龄及逆行排序存储。
		

	}

}
