package day18;

public class Student {
	private String xuehao;
	private String name;
	private String age;
	private String sex;

	public Student(){
		
	}
	public Student(String name,String age,String sex){
		this.name = name;
		this.age =age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "ѧ��������" + name + "   ���䣺" + age + "      �Ա�" + sex +"     ѧ�ţ�" + xuehao;
	}

	public String getXuehao() {
		return xuehao;
	}

	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
}
