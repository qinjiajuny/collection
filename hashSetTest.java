package collection;

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
		return "[编号=" + id + ", 姓名=" + name + "]";
	}
	
}
public class hashSetTest {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
//		hs.add("一号");
//		hs.add("二号");
//		hs.add("三号");
//		System.out.println(hs);
		hs.add(new people(12,"xx"));
		hs.add(new people(12,"qq"));
		System.out.println(hs);
		

	}

}
