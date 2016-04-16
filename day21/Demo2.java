package day21;
public class Demo2 {
	public static void main(String[] args) {
		// 电影院买票，四个窗口1000张票
		MyRunnable runnable = new MyRunnable();
		Thread thread1 = new Thread(runnable,"张三");
		Thread thread2 = new Thread(runnable,"李四");
		Thread thread3 = new Thread(runnable,"王五");
		Thread thread4 = new Thread(runnable,"赵六");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		
	}

}
