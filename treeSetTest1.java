package collection;

import java.util.TreeSet;

class Employee{
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
	
}
public class treeSetTest1 {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		tree.add(new Employee(01,"张三",1000));
		tree.add(new Employee(02,"李四",1500));
		tree.add(new Employee(03,"王五",800));
		tree.add(new Employee(04,"赵六",850));
		System.out.println(tree);
		
		

	}

}
