package day26;

import java.util.ArrayList;

public class PrcentThread extends Thread{
	ArrayList<Thread1> threads;
	private int length;
	public PrcentThread(ArrayList<Thread1> threads,int length){
		this.threads = threads;
		this.length =length;
	}
	@Override
	public void run() {
		int down = 0;
		while(length>down){
			down = 0;
			for (int i = 0; i < threads.size(); i++) {
				down+=threads.get(i).getDownLength();
			}
			System.out.println(100.0*down/length);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
