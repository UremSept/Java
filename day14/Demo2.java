package day14;

public class Demo2 {
	public static void main(String[] args) {
		People p = new People();
		p.setName("����");
		p.setSex(Sex.FEMALE);
		System.out.println("������"+p.getName());
		if(Sex.FEMALE==p.getSex()){
			System.out.println("�Ա�"+"Ů");
		}else System.out.println("�Ա�"+"��");
	}
}
