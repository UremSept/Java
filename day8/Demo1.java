package day8;

public class Demo1 {
	//…Ë÷√ÀΩ”– Ù–‘
	private int id;
	private String name;
	private String school;
	public Demo1(String name,String school){
		this.name=name;
		this.school=school;
	}
	public Demo1(){
		
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo1 [id=" + id + ", name=" + name + "]";
	}
	
	
}
