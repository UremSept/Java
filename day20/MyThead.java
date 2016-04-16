package day20;

public class MyThead extends Thread{
	int count = 20;
	public MyThead(String name){
		super(name);
	}
	@Override
	public void run() {
		while(count>0){
			System.out.println("正在发第"+count+"本书");
			count--;
			try {
				Thread.sleep(1000);//停滞1秒后继续运行
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("我等了1秒");
		}
	}
}
