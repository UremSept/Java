package day7;

public class Int {
	public static void main(String[] args) {
//		String str="123";
//		int i=Integer.parseInt(str);//���ַ���ת��Ϊint��
//		System.out.println(i);
		Integer i1=new Integer(127);//װ��
		Integer i2=new Integer(127);
		System.out.println(i1==i2);
		Integer i3=127;//����
		Integer i4=127;
		System.out.println(i3==i4);
		Integer i5=128;
		Integer i6=128;
		System.out.println(i5==i6);
		
	}
}
