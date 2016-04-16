package day19;

public class MyRunnable implements Runnable{
	private int count = 1000;
	
	@Override
	public void run() {
		while(count>0){
			System.out.println(Thread.currentThread().getName()+"Âô³öÆ±£º"+count);
			count--;
		}
		
	}
	
}
