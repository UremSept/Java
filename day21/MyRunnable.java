package day21;

import javax.sql.rowset.spi.SyncFactory;

public class MyRunnable implements Runnable {
	private int count = 1000;

	@Override
	public void run() {

		// while (count > 0) {
		// synchronized ("a") {
		// if(count==0)return;
		// System.out.println(Thread.currentThread().getName() + "����Ʊ��"
		// + count);
		// count--;
		// }
		//
		// }
		while (count > 0) {//�ж��Ƿ��ѭ��
			saleTicket();
		}

	}

	/*
	 * ͬ���������÷���������ָ���ø÷�����ʵ��
	 */
	public synchronized void saleTicket() {
		if (count > 0) {//�ж��Ƿ��ܳ��۴�Ʊ�������Ӵ��жϣ�����ָ���Ʊ�����
			System.out.println(Thread.currentThread().getName() + "����Ʊ��"
					+ count);
			count--;
		}
	}

}
