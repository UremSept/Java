package day3;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//=10;
		//ͨ��Scanner������ɿ���̨����
		Scanner s=new Scanner(System.in);
		//ͨ�����������ö����еķ���
		System.out.println("�����������ĳɼ���");
		int javaScore=s.nextInt();
		System.out.println("�������������Ա�");
		String sex=s.next();
//		if(100>=score&&score>=60)
//			System.out.println("�ϸ�");
//		if(score>=0&&score<60)
//			System.out.println("���ϸ�");
//		if(score>100||score<0)
//			System.out.println("����ɼ�����");
//		if(score>100)
//			System.out.println("����ɼ�����");
//		else if(score>=60)
//			System.out.println("�ϸ�");
//		else if(score>=0)
//			System.out.println("���ϸ�");
//		else if(score<0)
//			System.out.println("����ɼ�����");
		if(javaScore<10){
			System.out.println(sex.equals("��")?"����������":"����Ů����");
		}
		else{
			System.out.println("�˳�����");
		}
	}

}
