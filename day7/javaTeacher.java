package day7;

public class javaTeacher extends Teacher {

	public javaTeacher(){
		
	}
	public javaTeacher(String myname, String myschool) {
		super(myname, myschool);
		
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String toString() {
		return "javaTeacher [toString()=" + super.toString() + "]";
	}
	@Override
	public void showOwn(){
		System.out.println("我是：zhangdan 我讲 lzjtu 学校的课");
	}
	
	public static void main(String[] args) {
		javaTeacher javateacher=new javaTeacher();
		System.out.println(javateacher.toString());
	}

}
