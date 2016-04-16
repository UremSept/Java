package day7;

public class Teacher {
	private String name;
	private String school;
	public Teacher(){
		
	}
	public Teacher(String myname,String myschool){
		name=myname;
		school=myschool;
	}
	public void giveLesson(){
		System.out.println("我正在讲课！");
	}
	public void showOwn(){
		System.out.println("我是："+name+"我讲 "+school+" 学校的课");
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", school=" + school + "]";
	}
	
}
