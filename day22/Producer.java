package day22;

public class Producer extends Thread{
	public String lock;
	public  Producer(String lock){
		this.lock = lock;
	}
	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("生产者进入，此时仓库是空的！！！");
			System.out.println("生产者生产产品，放入仓库");
			try {
				lock.wait();//本线程休眠，通知其他使用该锁的线程可以使用该锁
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("生产者被重新唤醒");
		}
		
	}
}
