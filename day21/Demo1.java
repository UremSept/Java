package day21;

public class Demo1 {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread3 thread3 = new Thread3();
		thread1.start();
		thread2.start();
		thread3.start();//����߳��У���������������������ͬ��
		//������ͬһ����������������֮�󣬻���ͬһʱ�䣬ֻ����һ���߳�����
		
	}
}
