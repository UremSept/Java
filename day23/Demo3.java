package day23;

public class Demo3 {

	public static void main(String[] args) {
		PeopleFactory s = new PeopleFactory();
		People a = s.createPeople();
		a.speak();
	}

}
