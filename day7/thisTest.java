package day7;

public class thisTest {

	/**
	 * this :ָ��ǰ����
	 * ����ͨ��this���õ�ǰ�����е����Ժͷ���
	 * ����ͨ��this()���õ�ǰ�����Ĺ��췽��
	 * @param args
	 */
	private int id;
	private String name;
	public thisTest(){
		System.out.println("����һ���޲εĹ��췽��");
	}
	public thisTest(int id){
		this();
		this.id=id;
		System.out.println("����һ���вεĹ��캯��");
	}
	public thisTest(String name,int id){
		this(id);
		this.name=name;
		System.out.println("���������������Ĺ��캯��");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//thisTest nn=new thisTest();
	//thisTest n=new thisTest(24);
	thisTest M=new thisTest("����",56);

	}

}
