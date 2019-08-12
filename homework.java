package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 
作业2：使用集合实现注册登陆功能，
第一步： 提示用户选择功能， A（注册）  B(登陆) 。 要求： 功能选择 的时候要忽略大小写。
1.注册：
提示用户输入注册的账号(数字)与密码，如果输入的id号已经存在集合中，
提示用户重新输入。 注册完毕之后，把集合中的所有用户信息打印出来。(使用：toArrry()方法)	
2.登陆： 
提示用户输入登陆的账号与密码,如果账号与密码这个用户已经存在集合中，那么登陆成功，否则登陆失败。*/


//设计用户类
class User{
	int id;
	String password;	
	//设计构造方法
	public User(int id, String password) {
		
		this.id = id;
		this.password = password;
	}
	//使用contains方法 重写equals方法
	@Override
	public boolean equals(Object obj) {
		User user = (User)obj;//强制转换
		return this.id==user.id;
	}
	
	//id跟password的get set方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//重写toString方法
	@Override
	public String toString() {
		return "{ 账号："+this.id+" 密码："+this.password+"}";
	}
}

public class homework {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		//创建user集合保存用户的账号密码
		Collection user = new ArrayList();
		//系统页面
		while(true)
		{
		System.out.println(" 请选择要使用的功能      A.注册  B.登录                              ");
		//选择功能，忽略大小写
		String choose = in.next();
	
		//equalsIgnoreCase() 方法用于将字符串与指定的对象比较，不考虑大小写。
		//如果给定对象与字符串相等，则返回 true；否则返回 false。
		if("a".equalsIgnoreCase(choose))
		{
			register(in, user);
				
		}
		
	
		else if("B".equalsIgnoreCase(choose))
		{
			login(in, user);
		}
		
		else
			System.out.println("选择有误，请重新输入。");
		}

	}
	
	
	//登录功能
	public static void login(Scanner in, Collection user) {
		//提示输入账号密码
		System.out.println("你选择了登录功能！");
		System.out.println("请输入账号：");
		int id  = in.nextInt();
		System.out.println("请输入密码：");
		String passward = in.next();
		//判断集合的用户是否存在该用户名与密码
		//遍历集合的元素，查看是否存在该用户信息
		
		//定义变量用于记录是否登陆成功的信息  , 默认是没有登陆成功的
		
		boolean isLogin = false; 	
		
		Iterator it = user.iterator();
		//使用迭代器遍历
		while(it.hasNext())
		{
			User u = (User) it.next();
			//比较账号密码是否一致
			if((u.id==id)&&(u.password.equals(passward)))
			{
				isLogin = true;	
			}
		}
		
		if(isLogin)
		{
			System.out.println("登录成功！");
			System.out.println("已经注册了的人员："+user);		
			
		}
		else
		System.out.println("账号密码有误，请重新输入！");
	}
	
	//注册功能
	public static void register(Scanner in, Collection user) {
		User u = null;
		System.out.println("你选择了注册功能！");
		//判断账号id是否存在
		while(true)
		{
		System.out.println("请输入账号：");
		int id = in.nextInt();
		 u = new User(id,null);
		if(user.contains(u)){
			System.out.println("该id已经存在，请重新输入！");
		}
		else {
			break;
		}
		}
			System.out.println("请输入密码：");
			String password = in.next();
			u.setPassword(password);
			//把user对象保存到集合中
			user.add(u);
			System.out.println("注册成功!");
			System.out.println("当前注册的人员："+u);
	}

}
