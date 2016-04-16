package day19;

public class ThreadTest extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName()+"Ïß³ÌÊä³ö£º"+i);
		}
	}
}
