package collection;
import java.util.ArrayList;
import java.util.Collection;
/*判断：
 * 三个方法的返回值都是布尔型
 * isEmpty() 
	contains(Object o) 
	containsAll(Collection<?> c)
 * */



class Person//新建person类为了集合能添加自定义类型的元素
{
	int id;
	String name;
	public Person(int id,String name)//自定个构造方法
	{
		this.id = id;
		this.name = name;
	}
	//重写toString方法
	//不重写的话直接调用Object类的toString方法即打印该对象的内存地址Person类
	@Override
	public String toString() {
		
//		return super.toString();
		return "{id:"+this.id+" name:"+this.name+"}  ";
	}
	//重写equals方法
	@Override
	public boolean equals(Object obj) {
		
//		return super.equals(obj);
		Person p = (Person)obj;
		return this.id == p.id ;//按id唯一规则的话只需比较id即可
	}
	//java规范： 一般重写equlas方法我们都会重写hashCode方法的。
	@Override
	public int hashCode() {
//		return super.hashCode();
		return this.id;
	}
	
}

public class ColletcionTest2 {

	public static void main(String[] args) {
//		Collection c = new ArrayList();
//		c.add("张三");
//		c.add(4);
//		System.out.println(c.isEmpty());//isEmpty()判断集合c是否为空
////		c.clear();
////		System.out.println(c.isEmpty());
//		System.out.println(c.contains(4));//判断集合中是否含有该元素
		
		//试验自定义类型能否判断
		Collection c = new ArrayList();
		c.add(new Person(01,"张三"));
		c.add(new Person(02,"李四"));
		c.add(new Person(03,"王六"));
		
		System.out.println("集合C的元素："+c);//会打印虚拟地址，得重现toString方法
		//查看源码知道其实contains()依赖于equals方法进行比较
		//而equals方法比较的内存地址
		//所以结果为false得重写equal方法
		System.out.println(c.contains(new Person(02,"李四")));
		
		Collection c2 = new ArrayList();
		c2.add(new Person(01,"张三"));
		c2.add(new Person(03,"李四"));
		//containsAll()此集合是否包含指定集合中的所有元素
		//根据重写的equals方法之比较id
		System.out.println(c.containsAll(c2));

		
		

	}

}
