package collection;

import java.util.LinkedList;
import java.util.Random;

/*
需求： 使用LinkedList存储一副扑克牌，然后实现洗牌功能。

*/

//定义一个扑克类
class Poker
{
	String color;//花色
	String num;//点数
	//构造方法
	public Poker(String color,String num)
	{
		this.color = color;
		this.num = num;
		
	}
	//重写toString方法
	@Override
	public String toString() {		
		return "{"+this.color+""+this.num+"}";
	}
}

public class pokerTest {
	

	public static void main(String[] args) {
		//生成poker
		LinkedList poker = createPoker();
		showPoker(poker);
		System.out.println("牌数:"+poker.size()+"张");
		sufflePoker(poker);
		System.out.println("洗牌后：");
		showPoker(poker);
		

	}
	//生成扑克牌的方法 返回一个LinkedList
	public static LinkedList createPoker()
	{
	
		 //创建LinkedList来存储
		LinkedList list = new LinkedList();
		//创建两个数组来存储花色和数字
		String[] color = {"黑桃♠","红心♥","梅花♣","方块♦"};
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for(int i = 0;i<color.length;i++)
		{
			for(int j =0;j<num.length;j++)
			{	
				list.add(new Poker(color[i],num[j])); 
			}
		}
		return list;

}
	//显示poker的方法
	public static void showPoker(LinkedList list)
	{
		for(int i =0;i<list.size();i++)
		{
			System.out.print(list.get(i));
			//每13个换行 0-12就有13个
			//如果是i%12==0 黑桃A就会单独一行
			if(i%13==12)
			System.out.println();
		}
	}
	//洗牌，在此值传递的是同一个对象
	public static void sufflePoker(LinkedList poker)
	{
		//创建随机数对象
		Random random = new Random();
		//让其洗100次
		for(int i=0;i<100;i++)
		{
		//创建两个随机的索引值,范围从0-poker的长度
		int index1 = random.nextInt(poker.size());
		int index2 = random.nextInt(poker.size());
		//根据索引值随机取出两张牌
		Poker poker1  = (Poker)poker.get(index1);
		Poker poker2  = (Poker)poker.get(index2);
		//交换他们的位置，完成一次洗牌
		poker.set(index1,poker2);
		poker.set(index2,poker1);
		}
		
		
	}
}
