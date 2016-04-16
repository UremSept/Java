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
		//public int indexOf(int ch)搜索第一个出现的字符ch,返回其出现的位置
		//public int indexOf(String ch)搜索第一个出现的字符串ch,返回其第一个字符出现的位置
		System.out.println(str5.indexOf('a'));
		//public String substring(int a,int b)截取字符串中a-b的字符串
		//StringBuffer
		String str=new String("hello");
		StringBuffer ss=new StringBuffer(str);//可变字符串类型
		ss.append("world");//在字符串之后追加字符串
		System.out.println(ss);
		String str7=ss.toString();//转化为string类型
		//insert(i,',');在字符串的i位置插入字符','
		
	}

}
