package day21;

import javax.sql.rowset.spi.SyncFactory;

public class MyRunnable implements Runnable {
	private int count = 1000;

	@Override
	public void run() {

		// while (count > 0) {
		// synchronized ("a") {
		// if(count==0)return;
		// System.out.println(Thread.currentThread().getName() + "卖出票："
		// + count);
		// count--;
		// }
		//
		// }
		while (count > 0) {//判断是否该循环
			saleTicket();
		}

	}

	/*
	 * 同步方法，该方法的锁是指调用该方法的实例
	 */
	public synchronized void saleTicket() {
		if (count > 0) {//判断是否能出售此票，若不加此判断，会出现负数票的情况
			System.out.println(Thread.currentThread().getName() + "卖出票："
					+ count);
			count--;
		}
	}

}
