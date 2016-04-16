package day14;

public class Demo2 {
	public static void main(String[] args) {
		People p = new People();
		p.setName("张三");
		p.setSex(Sex.FEMALE);
		System.out.println("姓名："+p.getName());
		if(Sex.FEMALE==p.getSex()){
			System.out.println("性别："+"女");
		}else System.out.println("性别"+"男");
	}
}
