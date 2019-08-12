package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


/*
练习： 使用三种方式遍历集合的元素. 	
第一种： 使用get方法遍历。
第二种： 使用迭代器正序遍历。
第三种： 使用迭代器逆序遍历。

*/

public class bianli {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add(23);
		System.out.println("======get方法遍历========");
		for(int i =0;i<list.size();i++)
		{
			System.out.print(list.get(i)+",");
		}
		ListIterator it = list.listIterator();
		System.out.println("\n======迭代器正序遍历========");
		
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
		System.out.println("\n======迭代器逆序遍历========");
		while(it.hasPrevious())
		{
			System.out.print(it.previous()+",");
		}
		
		
		

	}

}
