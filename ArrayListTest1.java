package collection;

import java.util.ArrayList;
import java.util.Iterator;

class book{
	int id;
	String name;
	public book(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	//重写equals方法，id一样则视为相同
	@Override
	public boolean equals(Object obj) {
		book b = (book)obj;
		return this.id == b.id;
	}
	//重写toString方法，不然输出的是虚拟内存地址
	@Override
	public String toString() {
		
		return "编号："+this.id+", 书名："+this.name+" ";
	}
}
//需求： 编写一个函数清除集合中重复元素。 如果书号是一样就视为重复元素。  
//要求： 遍历集合元素的时候必须使用迭代器。
//思路：创建一个空的arraylist存放
public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(new book(01,"红楼梦"));
		a.add(new book(02,"三国演义"));
		a.add(new book(03,"水浒传"));
		a.add(new book(04,"西游记"));
		a.add(new book(04,"西游记"));
		
		ArrayList b = new ArrayList();
		Iterator it = a.iterator();//迭代器
		//迭代器遍历
		while(it.hasNext())
		{
			book book = (book) it.next();
			//把A集合的元素逐个丢到B集合，如果在B集合没有重复就添加进去
			if(!b.contains(book))
			{
				b.add(book);
			}
			
		}
		System.out.print("整理后:"+b);
		
		

	}

}
