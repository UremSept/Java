package day21;

public class Thread2 extends Thread {
	@Override
	public void run() {
		while (true) {
			synchronized ("b") {
				System.out.println("线程2打印内容");
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
