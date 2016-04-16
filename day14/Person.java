package day14;

public class Person <T extends Pet>{
	private T pet;

	public T getPet() {
		return pet;
	}

	public void setPet(T pet) {
		this.pet = pet;
	}
}
