package day20;

public class MyRunnable implements Runnable {
	private int count = 1000;

	@Override
	public void run() {

		while (count > 0) {
			
			synchronized ("abc") {//对代码块中的数据加锁，同时只能有一个线程访问
				count -= 100;
				System.out.println(Thread.currentThread().getName()
						+ "取了100块钱，" + "余额：" + count);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("测试");

		}

	}

}
