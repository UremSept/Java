package day5;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ����equals������equals�Ƚ��ַ�����ֵ�Ƿ���ȫ��ͬ������ֵtrue or false
		String str1="abc";
		String str2="abc";
		System.out.println(str1.equals(str2));
		//����compareTo������A.compareTo(B)compareTo�Ƚ������ַ�����ֵ�Ƿ���ͬ�����ʱ����ֵΪ0����ͬʱת��Ϊascii�����A-B
		String str3="abC";
		String str4="abc";
		//System.out.println((int)'C'-'c');
		System.out.println(str3.compareTo(str4));
		//equalsIgnoreCase������Ǵ�Сд�Ƚ�
		System.out.println(str3.equalsIgnoreCase(str4));
		//toLowerCase:�������ַ�ת��ΪСд
		System.out.println(str3.toLowerCase());
		//toUpperCase���������ַ�ת��Ϊ��д
		System.out.println(str3.toUpperCase());
		//+:�ַ������ӷ�
		//concat:�ַ������ӷ���
		String str5="afrewf";
		String str6=str5.concat(",java");
		System.out.println(str6);


		
	}

}
