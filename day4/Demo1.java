package day4;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
//		//��������
//		int[] a;
//		int b[];
//		//���������ռ�
//		int[] i=new int[3];
//		//��ÿ������ռ丳ֵ
//		i[0]=12;
//		i[1]=35;
//		i[2]=52;
//		for(int m=0;m<3;m++)
//		System.out.println(i[m]);
		int[] i=new int[]{35,52,72,64};
		//ʵ����Scanner���� ctrl+1 �����ʾ�����
		Scanner s=new Scanner(System.in) ;
		System.out.println("����ռ��СΪ��"+i.length);
		System.out.println("���������ݣ�");
		for(int j=0;j<i.length;j++){
			i[j]=s.nextInt();
		}
		for(int j=0;j<i.length;j++){
			System.out.println("��"+j+"���ռ�����ݣ�"+i[j]);
		}
	}
}
