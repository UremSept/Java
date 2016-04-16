package day6;

public class Student {
	String name;
	int age;
	String cless;//班级
	String likes;//爱好
	/*
	 * 展示自己的信息
	 */
	public void show(){
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("班级："+cless);
		System.out.println("爱好："+likes);
	}
}
