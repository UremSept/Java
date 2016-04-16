package day22;

public class Consumer extends Thread {
	public String lock;
	public Consumer(String lock){
		this.lock = lock;
	}
	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("�����߽��룡����");
			System.out.println("��ʼ���Ѳ�Ʒ����ղֿ�");
			lock.notify();//�����ͷŹ��������߳�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("����������");
		}
	}
	
}
