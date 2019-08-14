package collection;

import java.util.ArrayList;

/*
集合的体系：
----------| Collection  单列集合的根接口
----------------| List 如果实现了List接口的集合类，具备的特点： 有序，可重复。
--------------------| ArrayList   ArrayList 底层是维护了一个Object数组实现 的，
 						特点: 查询速度快(因为像数组一样有索引值)，增删慢(得把旧的数组拷贝到新的数组)。
什么时候使用ArrayList: 
如果目前的数据是查询比较多，增删比较少的时候，那么就使用ArrayList存储这批数据。  
比如 ：高校的 图书馆
--------------------| LinkedList
--------------------| Vector(了解即可)

----------------| Set  如果实现了Set接口的集合类， 具备的特点： 无序，不可重复。

ArrayList 特有的方法：

	ensureCapacity(int minCapacity)方法增加此ArrayList實例的容量，如果需要，以確保其能容納至少由最小容量參數指定的元素數。
	该方法不常用，通常使用ArrayList(int initialCapaciay)带参数的构造方法来实现
	trimToSize()  将存储空间缩小成要占有的大小(例如初始化空间为10，里面只有三个元素，调用后删除七个空白空间，不常用！！)
	

笔试题目： 使用ArrayList无参的构造函数创建一个 对象时， 默认的容量是多少? 如果长度不够使用时又自增增长多少？
	ArrayList底层是维护了一个Object数组实现 的，使用无参构造函数时，Object数组默认的容量是10，当长度不够时，自动增长0.5倍。
*/
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(1);
		System.out.println(arraylist.size());
	    arraylist.ensureCapacity(15);
		System.out.println(arraylist.size());


	}

}
