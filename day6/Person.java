package day6;

public class Person {
	String pid;
	String  name;
	int age;
	String sex;
	String jg;
/*类的方法：四种
无参数无返回值
有参数无返回值
无参数有返回值
有参数有返回值
//	String pid="620523199508281690";
//	String  name="厚杰";
//	int age=29;
//	String sex="男";
//	String jg="甘谷天水";
//	public void output(){
//		System.out.println("身份证号："+pid);
//		System.out.println("姓          名："+name);
//		System.out.println("性          别："+sex);
//		System.out.println("籍          贯："+jg);
//		System.out.println("年          龄："+age);
//	}
//	public void run(String name){
//		System.out.println(name+"正在跑");
//	}
//	public String who(){
//		return name;
//	}
//	public String runing(String name){
//		System.out.println(name+"正在跑");
//		return name;
//	}*/
	
	/**
	 * 构造方法
	 *public Person(){	
	}//默认的构造方法
	若要自己写构造方法，则必须要把它写出来
	 */ 
	public Person(){
		String pid="620523199508281690";
		String  name="厚杰";
		int age=29;
		String sex="男";
		String jg="甘谷天水";
	}
	
}
