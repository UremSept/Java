package day12;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 demo = new Demo1();
		try {
			demo.setAge(123);
		} catch (AgeException e) {
			e.printStackTrace();
		}

	}

}
