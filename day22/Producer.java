package day22;

public class Producer extends Thread{
	public String lock;
	public  Producer(String lock){
		this.lock = lock;
	}
	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("�����߽��룬��ʱ�ֿ��ǿյģ�����");
			System.out.println("������������Ʒ������ֿ�");
			try {
				lock.wait();//���߳����ߣ�֪ͨ����ʹ�ø������߳̿���ʹ�ø���
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�����߱����»���");
		}
		
	}
}
