package day22;

public class CopyOfProducer extends Thread{
	public WareHouse lock;
	public  CopyOfProducer(WareHouse lock){
		this.lock = lock;
	}
	@Override
	public void run() {
		while(true){
			lock.produceProduction();

		}
			
		
	}
}
