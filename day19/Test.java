package day19;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ThreadTest thread = new ThreadTest();
//		thread.start();
//		for (int i = 0; i < 1000; i++) {
//			System.out.println(Thread.currentThread().getName()+"�߳����"+i);
//		}
		RunnableTest runnable = new RunnableTest();
		Thread thread = new Thread(runnable,"���߳�");
		thread.start();
	}

}
