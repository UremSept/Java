package day20;

public class MyRunnable implements Runnable {
	private int count = 1000;

	@Override
	public void run() {

		while (count > 0) {
			
			synchronized ("abc") {//�Դ�����е����ݼ�����ͬʱֻ����һ���̷߳���
				count -= 100;
				System.out.println(Thread.currentThread().getName()
						+ "ȡ��100��Ǯ��" + "��" + count);
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
			System.out.println("����");

		}

	}

}
