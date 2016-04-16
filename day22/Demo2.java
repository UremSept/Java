package day22;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WareHouse ware = new WareHouse();
		CopyOfConsumer con = new CopyOfConsumer(ware);
		CopyOfProducer pro = new CopyOfProducer(ware);
		con.start();
		pro.start();

	}

}
