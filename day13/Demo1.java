package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Demo1 {
	public static void main(String[] args) {
	//�������10�����ظ�����λ��
		Random random = new Random();
		HashSet<Integer> set=new HashSet<Integer>();//���Ͳ���ʹ�ü��������ͣ�������һ����
		while(set.size()<10){
			int j =random.nextInt(90)+10;
			set.add(j);
		}	
		System.out.println(set);//��tostring ����������Ԫ�ش�ӡ����		
		Iterator<Integer> iterator = set.iterator();//����һ����������
		while(iterator.hasNext()){//�ж���һ���Ƿ����
			int a=iterator.next();	//����һ������ȡ������ֵ��a
			System.out.print(a+" ");//���
		}
	
}
}
