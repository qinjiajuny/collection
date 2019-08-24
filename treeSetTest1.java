package collection;

import java.util.TreeSet;
/*
 * TreeSet的存储原理：
 * 底层是红黑树（二叉树的一种形式）数据结构实现的
 * 存储的规则是左小右大*/
class Employee implements Comparable{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{id=" + id + ", " + name + "," + salary + "}";
	}

	//Comparable接口需要实现的方法
	//写元素与元素之间的比较规则 compareTo的返回值若负整数，零或正整数，
	//则该对象小于，等于或大于指定对象。(即其是将两个对象相减
	//调试时发现：当使用add方法时会先调用构造方法传值，即第一个add方法
	//的this.salary是1000，然后会调用comparTo方法，将当前值传进去
	//此时的e.salary==this.salary 返回0 
	//随后this.salary变为1500，此时的e.salary仍为1000，相减得正数
	//以此达到排序的目的
	@Override
	public int compareTo(Object arg0) {
		Employee e = (Employee)arg0;
		
		
			/*
			 张三与张三比较(自己与自己比较)
			 李四与张三比较
			 王五与张三比较
			 赵六与张三比较
			 赵六与王五比较*/
		System.out.println(this.name+"与"+e.name+"比较");
		return this.salary-e.salary;//按薪水从高到低排列
	}
	
}
public class treeSetTest1 {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		tree.add(new Employee(01,"张三",1000));
		tree.add(new Employee(02,"李四",1500));
		tree.add(new Employee(03,"王五",800));
		tree.add(new Employee(04,"赵六",850));
		tree.add(new Employee(05,"赵六2",850));
		//tree.add(new Employee(05,"赵六",870));
		System.out.println(tree);
		
		

	}

}
