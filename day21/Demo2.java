package day21;
public class Demo2 {
	public static void main(String[] args) {
		// ��ӰԺ��Ʊ���ĸ�����1000��Ʊ
		MyRunnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable,"����");
		Thread thread2 = new Thread(runnable,"����");
		Thread thread3 = new Thread(runnable,"����");
		Thread thread4 = new Thread(runnable,"����");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		
	}

}
