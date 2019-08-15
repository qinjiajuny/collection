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

		System.out.println("获取集合中首位置的元素:"+list.getFirst());
		System.out.println("获取集合中末尾的元素："+ list.getLast());
	
		System.out.println("删除集合中的首位置元素并返回："+ list.removeFirst());
		System.out.println("删除集合中的末尾素并返回："+ list.removeLast());
			
		
		list.push("狗娃");   //将该元素插入此集合的开头处。 
		System.out.println("删除集合的首元素："+list.pop()); // 移除并返回集合中的第一个元素 

		
		list.offer("狗剩");
		System.out.println("删除集合的首元素: "+list.poll());
	
		System.out.println("集合中的元素："+ list);
			
		Iterator  it = list.descendingIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		

	}

}
