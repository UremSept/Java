package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zhengze {
	public static void main(String[] args) {
		//�ֻ���
		String s = "^1{1}[3578]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(s);
		Matcher m = p.matcher("18194215287");
		boolean b = m.matches();
		System.out.println(b);
		//����ƥ��
		//������@
		//@ֻ��һ��
		//@֮ǰ������ĸ���»���
		//@֮ǰ����������1-16
		//@֮�����ֻ���ĸ
		//��һ��.
		//��׺ .com | .com.cn | .net | .info | .org | .edu
		//^\\w{1,16}@[\w&&^_]{2,10}\.(com|com\.cn|net|info|org|edu){1}$
		boolean b2 = Pattern.matches("^\\w{1,16}@[a-zA-Z0-9]{2,10}\\.(com|com\\.cn|net|info|org|edu){1}$", "hj865830228@163.com");
		System.out.println(b2);
		/*
		 * ����8~16λ������������ĸ�»��ߵ����
		 * ���������� �����д�д��ĸ������Сд��ĸ
		 * "^\\w{8,16}$"
		 * */
		String regex = "^(?![a-zA-Z_]{8,16}$)(?![a-z0-9_]" +
				"{8,16}$)(?![0-9A-Z_]{8,16}$)\\w{8,16}$";
		Pattern mima = Pattern.compile(regex);
		Matcher matcher = mima.matcher("Ab8658030");
		boolean b0 = matcher.matches();
		System.out.println(b0);
		
		
		
	}
}
