package day19;

public class RunnableTest implements Runnable{

	int count = 1000;
	@Override
	public void run() {
		while(count>0){
		System.out.println("创建了一个新的线程，线程名称："+Thread.currentThread().getName());
		count--;
		}
	}
	
}