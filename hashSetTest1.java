package collection;

import java.util.HashSet;
import java.util.Scanner;

/*
需求： 接受键盘录入用户名与密码，如果用户名与密码已经存在集合中，
那么就是视为重复元素，不允许添加到HashSet中。
*/
class Users{
	String name;
	String password;
	
	public Users(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	//hashCode的返回类型为int，调用hashCode方法返回两个变量的哈希值来比较是否用户名和密码重复
	@Override
		public int hashCode() {
			
			return this.name.hashCode()+this.password.hashCode();
		}
	//重写equals方法比较用户名和密码是否重复
	@Override
	public boolean equals(Object obj) {
		Users u = (Users)obj;
		return u.name.equals(this.name)&&u.password.equals(this.password);
}
	
}
public class hashSetTest1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet set = new HashSet();
		while(true)
		{
		System.out.println("请输入用户名:");
		String username = in.next();
		System.out.println("请输入密码:");
		String password = in.next();
		System.out.println("添加成功？"+set.add(new Users(username,password)));
		
}
		
		

	}

}
