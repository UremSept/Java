package day19;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 电影院买票，四个窗口1000张票
		
//		MyThread thread1 = new MyThread("窗口1");
//		MyThread thread2 = new MyThread("窗口2");
//		MyThread thread3 = new MyThread("窗口3");
//		MyThread thread4 = new MyThread("窗口4");
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
		MyRunnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		Thread thread3 = new Thread(runnable);
		Thread thread4 = new Thread(runnable);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		
	}

}
