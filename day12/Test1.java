package day12;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;



public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getTime());
		SimpleDateFormat Format=new SimpleDateFormat("yyyy��MM��dd�� HH��mm");
		String s=Format.format(date);
		System.out.println(s);
		for(String m:args){
			System.out.println(m);
		}
		System.out.println(Math.abs(-5));//���� ֵ�ľ���ֵ��
		System.out.println(Math.cbrt(28));// ����ֵ����������
		System.out.println(Math.ceil(1.6));//(��)������С�ģ���ӽ��������double ֵ����ֵ���ڵ��ڲ�����������ĳ��������
		System.out.println(Math.ceil(1.1));
		System.out.println(Math.floor(2.3));//���ᣩ�������ģ���ӽ��������double ֵ����ֵС�ڵ��ڲ�����������ĳ��������
		System.out.println(Math.floor(3.9));
		System.out.println(Math.round(8.9));//�Ē�����
		System.out.println(Math.round(9.1));
		System.out.println(Math.max(1,5));
		System.out.println(Math.min(86,26));
		System.out.println(Math.PI);
		System.out.println(Math.E);	
		System.out.println(Math.toRadians(180));//���֌����ĽǶ�ֵ��0-PI��
		System.out.println(Math.toDegrees(Math.PI));//��Ƕ�ֵ��0-PI�������Ĕ���


		
		
	}

}
