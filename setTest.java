package collection;

import java.util.HashSet;
import java.util.Set;

public class setTest {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(1);
		s.add(4);
		s.add(3);
		s.add(2);
		System.out.println("添加成功吗？"+s.add(2));
		System.out.println(s);
		

	}

}
