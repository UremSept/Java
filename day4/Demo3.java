package day4;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		//数组初始化并取最大值测试
		 int[] i;
		 int max=0;
		 i=new int[5];
		 Scanner s=new Scanner(System.in) ;
		 System.out.println("数组空间大小为："+i.length);
		 System.out.println("请输入数据：");
		 for(int j=0;j<i.length;j++){
		 i[j]=s.nextInt();
		 if(max<i[j])max=i[j];
		 }
		
		 System.out.println("最大数值是："+max);
		
		// int a[] = new int[5];
	}
}
