package collection;
import java.util.Collection;
import java.util.ArrayList;
/*迭代
 * toArray()
 * */
import java.util.Arrays;

public class CollectionTest3 {

	public static void main(String[] args) {
//		Collection c = new ArrayList();
//		c.add("令计划");
//		c.add("徐才厚");
//		c.add("周永康");
//		//toArray()把集合中的元素全部 存储到一个Object的数组中返回
//		Object[] arr = c.toArray(); 
//		System.out.println("数组的元素："+Arrays.toString(arr));
		
		Collection c = new ArrayList();
		c.add(new Person(110,"狗娃"));
		c.add(new Person(119,"狗剩"));
		c.add(new Person(120,"铁蛋"));
		Object[] arr = c.toArray(); 
		
		//需求： 把编号是110的人信息 输出。
		for(int i = 0 ; i<arr.length ; i++){
			//从Object数组中取出的元素只能使用Object类型声明变量接收
			//如果需要其他 的类型需要进行强制类型转换。
			Person p = (Person) arr[i];  
			if(p.id==110){
				System.out.println(p);
			}
		}
		
		

	}

}
