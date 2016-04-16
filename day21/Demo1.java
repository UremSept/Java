package day21;

public class Demo1 {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread3 thread3 = new Thread3();
		thread1.start();
		thread2.start();
		thread3.start();//多个线程中，都有锁，若锁的名称相同，
		//表明是同一把锁，它们在声明之后，会在同一时间，只能有一个线程运行
		
	}
}
