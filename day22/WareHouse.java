package day22;

public class WareHouse {
	public synchronized void produceProduction(){
		System.out.println("������Ʒ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("������");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("wait���");
//		notify();<---------------------------------�˴�
	}
	public synchronized void consumeProduction(){
		System.out.println("��ʼ���Ѳ�Ʒ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�������");
		notify();
		System.out.println("notify��ķ���");
//		try {
//			wait();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//���produceProduction()�м�ͷָ��ĵط�����ʵ��������֪ͨ���ѣ��ȴ�������֪ͨ�����������������겻������
		//�ȴ�������֪ͨ���ѣ������Ͳ�������������ڲֿ�û��Ʒ��ʱ������
//		
	}
}
