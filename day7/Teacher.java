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
		System.out.println("�����ڽ��Σ�");
	}
	public void showOwn(){
		System.out.println("���ǣ�"+name+"�ҽ� "+school+" ѧУ�Ŀ�");
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", school=" + school + "]";
	}
	
}
