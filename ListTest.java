package collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
/*
集合的体系：

----------| Collection 单列集合 的根接口
--------------|  List  如果是实现了List接口的集合类，该集合类具备的特点：有序，可重复。
--------------|  Set   如果是实现了Set接口的集合类，该集合类具备的特点： 无序，不可重复。

有序： 集合的有序不是指自然顺序，而是指添加进去的顺序与元素出来的顺序是一致的。

List接口中特有方法：
	
	添加
		add(int index, E element) 
		addAll(int index, Collection<? extends E> c) 
	获取：
		get(int index) 
		indexOf(Object o) 
		lastIndexOf(Object o) 
		subList(int fromIndex, int toIndex) 
	修改：
		set(int index, E element) 

	迭代
		listIterator() 
*/

public class ListTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
//		list.add("赵六");
//		list.add("赵六");
		System.out.println("list集合里面的元素："+list);
		
		//添加的方法
		//add(index,element)把元素添加到指定的索引值位置处
//		list.add(0,"马七");
//		System.out.println("list集合里面的元素："+list);
		//addAll(int index, Collection<? extends E> c) 
		//把一个集合(list)的元素添加到指定索引值位置处
//		Collection c = new ArrayList();
//		c.add("小明");
//		c.add("小红");
//		list.addAll(3, c);
//		System.out.println("list集合里面的元素："+list);

		//获取的方法
		//get(int index) 获取指定索引值的元素
		System.out.println(list.get(1));
		//集合遍历的新方式(list接口)
		for(int i = 0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		//indexOf(Object o) 获取该元素第一次出现的索引值
		//lastIndexOf(Object o) 获取该元素最后一次出现的索引值
		System.out.println("\n第一次出现的位置："+list.indexOf("赵六"));
		System.out.println("最后一次出现的位置："+list.lastIndexOf("赵六"));	
		//subList(int fromIndex, int toIndex) 截取指定范围的元素(包前不包后)
		System.out.println("指定范围："+list.subList(0, 2));
		
		//修改的方法
		//set(int index, E element)将指定索引值位置的值更改
		list.set(1,"小马");
		System.out.println("list集合里面的元素："+list);

		 
		
	}

}
