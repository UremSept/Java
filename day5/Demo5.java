package day5;

import java.util.Scanner;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入一串数字：");
//		String nums = input.next();
//		StringBuffer str = new StringBuffer(nums);
//		for(int i=str.length()-3;i>0;i=i-3){
//			str.insert(i, ',');
//		}
//		System.out.println(str);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一串数字：");
		String nums = input.next();
		StringBuffer str = new StringBuffer(nums);
		for(int i=str.length()%3;i>0;i=i-3){
			str.insert(i, ',');
		}
		System.out.println(str);
	}

}
