package day21;

public class Thread2 extends Thread {
	@Override
	public void run() {
		while (true) {
			synchronized ("b") {
				System.out.println("�߳�2��ӡ����");
				synchronized ("c") {

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
