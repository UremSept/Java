package day4;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		//�����ʼ����ȡ���ֵ����
		 int[] i;
		 int max=0;
		 i=new int[5];
		 Scanner s=new Scanner(System.in) ;
		 System.out.println("����ռ��СΪ��"+i.length);
		 System.out.println("���������ݣ�");
		 for(int j=0;j<i.length;j++){
		 i[j]=s.nextInt();
		 if(max<i[j])max=i[j];
		 }
		
		 System.out.println("�����ֵ�ǣ�"+max);
		
		// int a[] = new int[5];
	}
}
