package day14;

public class Demo1 {
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Person zhangsan=new Person();
//		Pet pet = new Dog();
//		zhangsan.setPet(pet);
//		Pet zhangsanPet = zhangsan.getPet();
//	}
		Person<Dog> zhangsanDog = new Person<Dog>();
		Dog dog = new Dog();
		zhangsanDog.setPet(dog);
		(zhangsanDog.getPet()).kDoor();
		
	}
}
