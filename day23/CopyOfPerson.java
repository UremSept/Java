package day23;

public class CopyOfPerson {
	private String name;
	private String age;
	private String sex;

	private CopyOfPerson(){
		
	}
	private static CopyOfPerson copyOfPerson;
	
	public synchronized static  CopyOfPerson getCopyOfPerson(){
		if(copyOfPerson==null){
			return copyOfPerson=new CopyOfPerson();
		}
		return copyOfPerson;	
	}
}
