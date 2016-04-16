package day7;

public class thisTest {

	/**
	 * this :指向当前对象
	 * 可以通过this调用当前对象中的属性和方法
	 * 可以通过this()调用当前函数的构造方法
	 * @param args
	 */
	private int id;
	private String name;
	public thisTest(){
		System.out.println("这是一个无参的构造方法");
	}
	public thisTest(int id){
		this();
		this.id=id;
		System.out.println("这是一个有参的构造函数");
	}
	public thisTest(String name,int id){
		this(id);
		this.name=name;
		System.out.println("这是有两个参数的构造函数");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//thisTest nn=new thisTest();
	//thisTest n=new thisTest(24);
	thisTest M=new thisTest("张三",56);

	}

}
