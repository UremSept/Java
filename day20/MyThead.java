package day20;

public class MyThead extends Thread{
	int count = 20;
	public MyThead(String name){
		super(name);
	}
	@Override
	public void run() {
		while(count>0){
			System.out.println("���ڷ���"+count+"����");
			count--;
			try {
				Thread.sleep(1000);//ͣ��1����������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("�ҵ���1��");
		}
	}
}
