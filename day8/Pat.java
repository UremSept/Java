package day8;

public abstract class Pat {
	String name;
	int age;
	public abstract String getName();
	public abstract void setName(String name);
	public abstract int getAge();
	public	abstract  void setAge(int age);
	public void run(){
		System.out.println(this.name+"�����ܣ����Ѿ�"+age+"����");
	}
}
