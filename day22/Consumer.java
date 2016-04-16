package day22;

public class Consumer extends Thread {
	public String lock;
	public Consumer(String lock){
		this.lock = lock;
	}
	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("消费者进入！！！");
			System.out.println("开始消费产品，清空仓库");
			lock.notify();//唤醒释放过该锁的线程
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("唤醒生产者");
		}
	}
	
}
