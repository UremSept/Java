package day3;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//=10;
		//通过Scanner对象完成控制台输入
		Scanner s=new Scanner(System.in);
		//通过对象名调用对象中的方法
		System.out.println("请输入张三的成绩：");
		int javaScore=s.nextInt();
		System.out.println("请输入张三的性别");
		String sex=s.next();
//		if(100>=score&&score>=60)
//			System.out.println("合格！");
//		if(score>=0&&score<60)
//			System.out.println("不合格！");
//		if(score>100||score<0)
//			System.out.println("输入成绩有误");
//		if(score>100)
//			System.out.println("输入成绩有误！");
//		else if(score>=60)
//			System.out.println("合格！");
//		else if(score>=0)
//			System.out.println("不合格！");
//		else if(score<0)
//			System.out.println("输入成绩有误！");
		if(javaScore<10){
			System.out.println(sex.equals("男")?"进入男子组":"进入女子组");
		}
		else{
			System.out.println("退出比赛");
		}
	}

}
