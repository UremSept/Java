package day22;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String lock = "wareHouse";
		Producer producer = new Producer(lock);
		Consumer consumer = new Consumer(lock);
		producer.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		consumer.start();

	}

}
