package day23;

public class Demo2 {
	public static void main(String[] args) {
		CopyOfPerson Person1 = CopyOfPerson.getCopyOfPerson();
		CopyOfPerson Person2 = CopyOfPerson.getCopyOfPerson();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				CopyOfPerson Person3 = CopyOfPerson.getCopyOfPerson();
				System.out.println(Person3);
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				CopyOfPerson Person4 = CopyOfPerson.getCopyOfPerson();
				System.out.println(Person4);

			}
		});
		thread1.start();
		thread2.start();
		System.out.println(Person1);
		System.out.println(Person2);
	}

}
