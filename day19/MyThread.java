package day19;

public class MyThread extends Thread{
	private int count=250;
	public MyThread(String name){
		super(name);
	}
	@Override
	public void run() {
		while(count>0){
			System.out.println("����Ʊ"+count+"    �����ǣ�"+Thread.currentThread().getName());
			count--;
		}
	}
}
