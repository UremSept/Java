package day4;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
//		//声明数组
//		int[] a;
//		int b[];
//		//给数组分配空间
//		int[] i=new int[3];
//		//给每个数组空间赋值
//		i[0]=12;
//		i[1]=35;
//		i[2]=52;
//		for(int m=0;m<3;m++)
//		System.out.println(i[m]);
		int[] i=new int[]{35,52,72,64};
		//实例化Scanner对象 ctrl+1 快捷提示导入包
		Scanner s=new Scanner(System.in) ;
		System.out.println("数组空间大小为："+i.length);
		System.out.println("请输入数据：");
		for(int j=0;j<i.length;j++){
			i[j]=s.nextInt();
		}
		for(int j=0;j<i.length;j++){
			System.out.println("第"+j+"个空间的数据："+i[j]);
		}
	}
}
