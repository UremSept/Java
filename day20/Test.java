package day20;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThead thead = new MyThead("�߳�1");
		thead.start();
//		try {
//			thead.join();//��thread���뵽���߳�
//			//��ʱ���߳��������ȵ�thread������ϣ����̲߳��ܼ�������ִ�У���2000��main������2����ֿ�ʼ����
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("main�������");
		thead.setPriority(10);//�������ȼ������ǲ�һ�����ȼ��ߵ�������
		System.out.println(Thread.currentThread().getPriority());//�鿴���ȼ�
		System.out.println(thead.getPriority());
	}

}
