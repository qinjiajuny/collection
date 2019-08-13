package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
迭代:
	listIterator() 
ListIterator特有的方法：
	
	添加：
		hasPrevious()  判断是否存在上一个元素。
		previous()先移动再输出(类似++i)
		
		next() 先输出再移动(类似i++)
		
---------------------------	
	
		add(E e)   把当前有元素插入到当前指针指向的位置上。
		set(E e)   替换迭代器最后一次返回的元素。
*/
public class ListTest1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		ListIterator it = list.listIterator();//返回的是一个List接口中特有的迭代器
		//当前指针在张三处
		System.out.println("有上一个元素吗？"+ it.hasPrevious());
		//报错：无法获取到元素
//		System.out.println("获取上一个元素："+it.previous());
		//指针移动到李四位置
		it.next();
		//先输出李四，指针再移动到王五
		System.out.println("获取元素："+ it.next());
		//指针先移动到李四，再输出李四
		System.out.println("获取上一个元素："+ it.previous());
		//先输出李四，指针再移动到王五
		System.out.println("获取元素："+ it.next());
		/*previous()    当前指针先向上移动一个单位，然后再取出当前指针指向的元素。
		next() 先取出当前指针指向的元素，然后指针向下移动一个单位。*/
		//逆序输出list
		while(it.hasNext())//将指针移动到lsit的末尾处
		{
			System.out.print(it.next()+" ");
			
		}
		System.out.println();
		while(it.hasPrevious())//逆序输出
		{
			
			System.out.print(it.previous()+" ");
		}
		//如果列表迭代器位于列表的 previous ，则为-1 
		System.out.print(it.previousIndex()+" ");

		//迭代器的添加和更改方法
	/*add(E e)   把当前有元素插入到当前指针指向的位置上。
	set(E e)   替换迭代器最后一次返回的元素。*/
		//当前指针移动到了-1,add添加的元素位与previous之后（即索引值为0）
		//索引-1位置没有元素所以用set方法报错
		it.add("小明");
//		it.set("小明");
		System.out.println("\n集合："+list);
		//指针移动到了索引1处(即当前的元素是张三)
		it.next();
		it.set("小明");
		System.out.println("\n集合："+list);
		  
		
		

	}

}
