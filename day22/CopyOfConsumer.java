package day22;

public class CopyOfConsumer extends Thread {
	public WareHouse lock;
	public CopyOfConsumer(WareHouse lock){
		this.lock = lock;
	}
	@Override
	public void run() {
		while(true){
			lock.consumeProduction();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
