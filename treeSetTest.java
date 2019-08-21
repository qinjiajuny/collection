package collection;

import java.util.TreeSet;

/* TreeSet   
 * 如果元素具备自然顺序 的特性，那么就按照元素自然顺序的特性进行排序存储。*/
public class treeSetTest {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
//		tree.add(1);
//		tree.add(11);
//		tree.add(5);
//		tree.add(-1);
		//如果添加了整数 又添加char字符 则会报下列错误
		//java.lang.Integer cannot be cast to java.lang.Character
		tree.add('a');
		tree.add('h');
		tree.add('e');
		
		System.out.println(tree);

	}

}
