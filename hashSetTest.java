package collection;
/*
HashSet  底层是使用了哈希表来支持的，特点： 存取速度快. 
hashSet的实现原理：
	往Haset添加元素的时候，HashSet会先调用元素的hashCode方法得到元素的哈希值 ，
	然后通过元素 的哈希值经过移位等运算，就可以算出该元素在哈希表中 的存储位置。
	
情况1： 如果算出元素存储的位置上目前没有任何元素存储，那么该元素可以直接存储到该位置上。

情况2： 如果算出该元素的存储位置目前已经存在其他的元素了，那么会调用该元素的equals方法与该位置
的元素再比较一次，如果equals返回的是true，那么该元素与这个位置上的元素就视为重复元素，
不允许添加，如果equals方法返回的是false，那么该元素继续 添加。
*/
import java.util.HashSet;

class people{
	int id;
	String name;
	
	public people(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "{编号=" + id + ", 姓名=" + name + "}";
	}
	
	//重写hashCode方法，使其返回的哈希值为对象的id
	@Override
	public int hashCode() {
		//System.out.println("调用了hashCode方法");
		return this.id;
	}
	//重写equals方法 如果id一样则返回true，将该元素与这个位置上的元素就视为重复元素
	@Override
	public boolean equals(Object obj) {
		people p = (people)obj;
		return this.id==p.id; 
	}
}
public class hashSetTest {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
//		hs.add("一号");
//		hs.add("二号");
//		hs.add("三号");
//		System.out.println(hs);
		hs.add(new people(11,"张三"));
		hs.add(new people(12,"李四"));
		hs.add(new people(13,"王五"));
		hs.add(new people(14,"赵六"));
		//可以看见输出结果不一定是按照添加的顺序
		System.out.println("添加成功了吗？"+hs.add(new people(14,"小明")));
		
		System.out.println(hs);
		

	}

}
