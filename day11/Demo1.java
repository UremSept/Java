package day11;

import java.io.*;

public class Demo1 {

	public static void main(String[] args) {
		File file=new File("D://aaaa.txt");
		try{
			FileInputStream fis = new FileInputStream(file);
			fis.read();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			//��try catch���ʹ��
		}
		System.out.println("ִ�е�����");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
