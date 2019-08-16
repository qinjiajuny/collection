package collection;
import java.util.Iterator;
import java.util.LinkedList;
/*LinkedList底层是使用了链表数据结构实现的，  特点： 查询速度慢，增删快。
 * Linkedlist特有的方法：
	            addFirst(E e) 
				addLast(E e) 
		
				getFirst() 
				getLast() 
				
				removeFirst() 
				removeLast() 
	数据结构：
				1：栈   : 主要是用于为了模拟实现堆栈数据结构的存储方式。
					先进后出
					push() 
					pop()
				2：队列： 主要是为了让你们可以使用LinkedList模拟队列数据结构的存储方式。
					先进先出
					offer()
					poll()
*/

 public class LinkedListTest  {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		System.out.println(list);
		list.addFirst("狗娃"); //把元素添加到集合的首位置上。
		list.addLast("狗剩");  //把元素添加到集合的末尾处。
		System.out.println(list);
		
		//Returns the first element in this list.
		//如果集合中没有元素，获取或者删除元素抛异常NoSuchElementException

		System.out.println("获取集合中首位置的元素:"+list.getFirst());
		System.out.println("获取集合中末尾的元素："+ list.getLast());
		System.out.println("删除集合中的首位置元素并返回："+ list.removeFirst());
		System.out.println("删除集合中的末尾素并返回："+ list.removeLast());
		System.out.println(list);
		// 获取指定位置处的元素。
		String str = (String) list.get(1);
		System.out.println("位置1的元素："+str);
		
		
		//将该元素插入此集合的开头处。 进栈,相当于addFirst()
		list.push("狗娃");   
		System.out.println("push后的集合："+list);
		
		// 移除并返回集合中的第一个元素 ,出栈，相当于removeFirst()
		System.out.println("删除集合的首元素："+list.pop()); 
		System.out.println("pop后的集合："+list);
		
		//将指定元素添加到此列表的末尾，入队，相当于addLast()
		list.offer("狗剩");
		System.out.println("offer后的集合："+list);
		//list.poll()相当于list.pop() 都是检索并删除此列表的头（第一个元素）。 
		System.out.println("删除集合的首元素: "+list.poll());
	
		System.out.println("poll后集合中的元素："+ list);
		
		
		//descendingIterator逆序输出的迭代器。 
		//元素将按最后（尾）到第一（头）的顺序返回。 
		Iterator  it = list.descendingIterator();
		//该方法先把指针移动到队列的末尾，然后next方法先输出末尾元素，然后指针往上一位移动
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		

	}

}
