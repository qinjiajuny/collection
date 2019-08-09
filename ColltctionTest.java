package collection;
import java.util.ArrayList;
import java.util.Collection;

public class ColltctionTest {

	public static void main(String[] args) {
//	Collection  c = new Collection();//Collection是接口不能new
		Collection c = new ArrayList();
		/*添加的方法：
		 * add()
		 * addAll()
		 * */
		//增加一些数据
		c.add("abc");
		c.add('d');
		c.add(3.14);
		c.add(false);
		c.add(5);
		//add()方法的返回值是布尔型
		System.out.println("add()的返回值"+c.add("test"));
		System.out.println("集合c的所有元素："+c);
		
		//创建集合2
		Collection c2 = new ArrayList();
		//把集合c的元素添加到集c2
		c2.addAll(c);
		System.out.println("集合c2的所有元素："+c2);
		/*
		 * 删除的方法：
		 * clear()
		 * remove()
		 * removeAll()
		 * retainAll()
		 * */
//		c2.clear();//清空集合c2的所有元素
		c2.remove(5);//删除c2中指定的元素，成功返回true 失败返回false
		System.out.println("remove()的返回值"+c.remove(5));
		System.out.println("集合c2的所有元素："+c2);
		//新建集合c3
		Collection c3 = new ArrayList();
		c3.add("人名");
		c3.add("地名");
		c.addAll(c3);
		System.out.println("集合c3的所有元素："+c3);
//		System.out.println("集合c的所有元素："+c);
//		c.removeAll(c3);//删除集合c中包含c3的所有元素 ，返回值同样是布尔型
//		System.out.println("集合c的所有元素："+c);
//		System.out.println(c.removeAll(c3));
		c.retainAll(c3); //保留c集合与c3的交集元素，其他的元素一并删除。
		System.out.println("-----------------------");
		System.out.println("集合c的所有元素："+c);
		System.out.println("集合c3的所有元素："+c3);
		/*
		 * 查看
		 * size()
		 * */
		//查看集合的元素个数
		System.out.println(c.size());
		System.out.println(c2.size());
		

	}

}
