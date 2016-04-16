package day19;

public class MyThread extends Thread{
	private int count=250;
	public MyThread(String name){
		super(name);
	}
	@Override
	public void run() {
		while(count>0){
			System.out.println("Âô³öÆ±"+count+"    ´°¿ÚÊÇ£º"+Thread.currentThread().getName());
			count--;
		}
	}
}
