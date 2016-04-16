package day10;

//import day10.Demo1.book;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 内部类，局部类
//		Demo1 zhangsan = new Demo1();
//		book match = zhangsan.new book();
//		match.setBookName("java基础");
//		System.out.println(match.bookName);
		
	Demo1 D1 = new Demo1();
	D1.print();
	Demo1 D2 = new Demo2();
	D2.print();
	Demo1 D3 = new Demo2(){
		
	};
	D3.print();
	Demo1 D4 = new Demo1(){
		@Override
		public void print() {
			System.out.println("这是测试匿名内部类的");
		}
	};
	D4.print();
	
	//匿名内部类
	//代表创建类一个类，该类继承于Person，该类只生成一个对象，此时使用匿名内部类
	}

}
