package day21;

public class Thread1 extends Thread {
	@Override
	public void run() {
		while (true) {
			synchronized ("a") {
				System.out.println("�߳�1��ӡ����");
				synchronized ("b") {
					
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
