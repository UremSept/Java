package day21;

public class Thread3 extends Thread {
	@Override
	public void run() {
		while (true) {
			synchronized ("c") {
				System.out.println("线程3打印内容");
				synchronized ("a") {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		}
	}
}
