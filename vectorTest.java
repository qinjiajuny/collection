package collection;

import java.util.Enumeration;
import java.util.Vector;

/*
 * -------------------| Vector(了解即可)  底层也是维护了一个Object的数组实现的，
 * 实现与ArrayList是一样的，
 *但是Vector是线程安全的，操作效率低。
笔试题: 说出ArrayLsit与Vector的区别?
	相同点： ArrayList与Vector底层都是使用了Object数组实现的。
	
	不同点： 
		1. ArrayList是线程不同步的，操作效率高。 
		   Vector是线程同步的，操作效率低。
		2. ArrayList是JDK1.2出现，Vector是jdk1.0的时候出现的。
*/
public class vectorTest {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("张三");
		v.addElement("李四");
		v.addElement("王五");
		//创建vector的迭代器来遍历该集合
		Enumeration e  = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		

	}

}
