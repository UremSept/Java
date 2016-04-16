package day15;
import java.io.*;

public class Demo3 {
	public static void main(String[] args) {
		File file = new File("D:/test/bb.txt");
		try{
			InputStream s = new FileInputStream(file);
			byte [] b = new byte[4];
			int count = s.read(b);
			while(count!=-1){
				
				System.out.print(new String(b,0,count)); 
				count=s.read(b);
		}
			s.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	
	}
}