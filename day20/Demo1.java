package day20;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable aa = new MyRunnable();
		Thread zhangsan = new Thread(aa,"����");
		Thread lisi = new Thread(aa,"����");
		zhangsan.start();
		lisi.start();
	}

}
