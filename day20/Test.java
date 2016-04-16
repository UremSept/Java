package day20;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThead thead = new MyThead("线程1");
		thead.start();
//		try {
//			thead.join();//将thread加入到主线程
//			//此时主线程阻塞，等到thread运行完毕，主线程才能继续向下执行，传2000，main将会在2秒后又开始运行
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("main运行完毕");
		thead.setPriority(10);//设置优先级，但是不一定优先级高的先运行
		System.out.println(Thread.currentThread().getPriority());//查看优先级
		System.out.println(thead.getPriority());
	}

}
