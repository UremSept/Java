package day19;

public class RunnableTest implements Runnable{

	int count = 1000;
	@Override
	public void run() {
		while(count>0){
		System.out.println("������һ���µ��̣߳��߳����ƣ�"+Thread.currentThread().getName());
		count--;
		}
	}
	
}