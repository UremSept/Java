package day5;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 测试equals方法：equals比较字符串的值是否完全相同，返回值true or false
		String str1="abc";
		String str2="abc";
		System.out.println(str1.equals(str2));
		//测试compareTo方法：A.compareTo(B)compareTo比较两个字符串的值是否相同，相等时返回值为0，不同时转化为ascii码相减A-B
		String str3="abC";
		String str4="abc";
		//System.out.println((int)'C'-'c');
		System.out.println(str3.compareTo(str4));
		//equalsIgnoreCase：不理睬大小写比较
		System.out.println(str3.equalsIgnoreCase(str4));
		//toLowerCase:把所有字符转化为小写
		System.out.println(str3.toLowerCase());
		//toUpperCase：把所有字符转化为大写
		System.out.println(str3.toUpperCase());
		//+:字符串链接符
		//concat:字符串连接方法
		String str5="afrewf";
		String str6=str5.concat(",java");
		System.out.println(str6);


		
	}

}
