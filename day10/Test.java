package day10;

//import day10.Demo1.book;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �ڲ��࣬�ֲ���
//		Demo1 zhangsan = new Demo1();
//		book match = zhangsan.new book();
//		match.setBookName("java����");
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
			System.out.println("���ǲ��������ڲ����");
		}
	};
	D4.print();
	
	//�����ڲ���
	//��������һ���࣬����̳���Person������ֻ����һ�����󣬴�ʱʹ�������ڲ���
	}

}
