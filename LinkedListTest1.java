package collection;

import java.util.LinkedList;

/*
 * 机试题目： 
 * 使用LinkedList实现堆栈数据结构的存储方式与队列的数据结构存储方式。	
*/

// 使用LinkedList模拟堆栈的数据结构存储方式
class StackList{
	
	LinkedList list;
	public StackList()//构造方法
	{
		list = new LinkedList();
	}
	//入栈
	public void add(Object o)
	{
		list.push(o);
	}
	//出栈->删除首元素并返回,后进先出
	public  Object leave()
	{
		return  list.pop();
	}
	//获取堆栈元素个数
	public int getSize()
	{
		return list.size();
	}
	
}
//使用LinkedList模拟队列的存储方式
class TeamList{
	LinkedList list;
	public TeamList()//构造方法
	{
		list = new LinkedList();
	}
	//入队列
	public void add(Object o)
	{
		list.offer(o);
	}
	//出队列->删除首元素并返回,先进先出
	public  Object leave()
	{
		return  list.poll();
	}
	//获取队列元素个数
	public int getSize()
	{
		return list.size();
	}
	
}
public class LinkedListTest1 {

	public static void main(String[] args) {
		StackList list = new StackList();//实例化StackList类
		list.add("张三");
		list.add("李四");
		list.add("王五");
		int size = list.getSize();
		
		System.out.print("\nlist里面的元素是:");
		for(int k = 0 ; k<size ; k++){
			System.out.print(list.leave()+" ");
		}
		//System.out.println("堆栈的长度:"+list.getSize());
		//System.out.println("删除的元素是:"+list.leave());
		//System.out.println("堆栈的长度:"+list.getSize());
		
		//若不创建变量存储堆栈的初始长度，for循环的判断用的是list.size()的话其值会
		//因堆栈的长度不断出栈而一直在减小，不能完成遍历
//		for(int j = 0 ; j<size ; j++){
//			System.out.println(list.leave());
//		}
		
		//实例化队列
		TeamList list1 = new TeamList();
		list1.add("张三1");
		list1.add("李四1");
		list1.add("王五1");
		int size1 = list1.getSize();
		//若不创建变量存储堆栈的初始长度，for循环的判断用的是list.size()的话其值会
		//因堆栈的长度不断出栈而一直在减小，不能完成遍历
		System.out.print("\nlist1里面的元素是:");
		for(int i = 0 ; i<size1 ; i++){
			System.out.print(list1.leave()+" ");
		}
		//队列的顺序： 王五1>-李四1->张三1
		//poll方法是删除队列的
		//System.out.println("删除的元素是:"+list1.leave());
		


	}

}
