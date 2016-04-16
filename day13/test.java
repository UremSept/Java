package day13;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.out.println(8/0);
			System.out.println("这儿执行了");
		}
		catch(Exception e){
			System.out.println(e);	
		}
		System.out.println("执行到最后了");

	}

}
