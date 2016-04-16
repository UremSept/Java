package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Demo1 {
	public static void main(String[] args) {
	//随机生成10个不重复的两位数
		Random random = new Random();
		HashSet<Integer> set=new HashSet<Integer>();//泛型不能使用简单数据类型，必须是一个类
		while(set.size()<10){
			int j =random.nextInt(90)+10;
			set.add(j);
		}	
		System.out.println(set);//用tostring 方法将所有元素打印出来		
		Iterator<Integer> iterator = set.iterator();//创建一个迭代器，
		while(iterator.hasNext()){//判断下一个是否存在
			int a=iterator.next();	//将下一个内容取出，赋值给a
			System.out.print(a+" ");//输出
		}
	
}
}
