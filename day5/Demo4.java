package day5;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abc";
		String str2="abc";
		String str3="abC";
		String str4="abc";
		String str5="afrewf";
		String str6=str5.concat(",java");
		//public int indexOf(int ch)������һ�����ֵ��ַ�ch,��������ֵ�λ��
		//public int indexOf(String ch)������һ�����ֵ��ַ���ch,�������һ���ַ����ֵ�λ��
		System.out.println(str5.indexOf('a'));
		//public String substring(int a,int b)��ȡ�ַ�����a-b���ַ���
		//StringBuffer
		String str=new String("hello");
		StringBuffer ss=new StringBuffer(str);//�ɱ��ַ�������
		ss.append("world");//���ַ���֮��׷���ַ���
		System.out.println(ss);
		String str7=ss.toString();//ת��Ϊstring����
		//insert(i,',');���ַ�����iλ�ò����ַ�','
		
	}

}
