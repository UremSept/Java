package day20;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable aa = new MyRunnable();
		Thread zhangsan = new Thread(aa,"张三");
		Thread lisi = new Thread(aa,"李四");
		zhangsan.start();
		lisi.start();
	}

}
