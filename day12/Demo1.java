package day12;

public class Demo1 {
	String name;
	int age;
	int sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age){
		if(age<120)
			this.age = age;
		else {
			throw new AgeException();
		}
		
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
}
