package day22;

public class WareHouse {
	public synchronized void produceProduction(){
		System.out.println("生产商品");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("生产完");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("wait完成");
//		notify();<---------------------------------此处
	}
	public synchronized void consumeProduction(){
		System.out.println("开始消费产品");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("消费完成");
		notify();
		System.out.println("notify后的方法");
//		try {
//			wait();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//配合produceProduction()中箭头指向的地方可以实现生产完通知消费，等待消费者通知生产，消费者消费完不再消费
		//等待生产者通知消费，这样就不会出现消费者在仓库没产品的时候消费
//		
	}
}
