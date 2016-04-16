package day15;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
	
	
	public static void main(String[] args) {
		
	
		/*
		//��ʼ��һ���ļ��ķ���
		//1
		File file1 = new File("I:/test/text1.txt");
		//2
		File dir = new File("I:/test");
		File file2 = new File(dir,"text1.txt");
		//3
		File file3 = new File("I:/test","text1.txt");
		*/
		
/*		//����һ�����ļ���
		File file4 = new File("D:/test");
		file4.mkdir();//����Ŀ¼һ������ʱ�ô˷���
		File file5 = new File("D:/test/dd/mm");
		file5.mkdirs();//����Ŀ¼��һ������ʱ���ô˷���
		File file6 = new File("D:/test/bb.txt");
		try {
			file6.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//����һ�����ļ�
*/
		File dir = new File("D:/test");
		Javaa(dir);
	}
	//����������һ��ָ�����ļ��У��ж����е��ļ����ļ���
	private static void Javaa(File dir) {
		if(dir.isFile()){
			System.out.println("����һ���ļ��������ļ���");
			return;
		}//�ж��ǲ����ļ��������ļ�������
		if(dir.isDirectory()){
		File[] list = dir.listFiles();//��ȡ�ļ���Ŀ¼���嵥�浽������
		for(File file:list){
			System.out.println("�ļ����ƣ�"+file.getName());
			if(file.getName().endsWith(".java")){//endswith�ж�һ���ַ����Ƿ�����ָ���ַ�������
				System.out.println("�ļ�����·����"+file.getAbsolutePath());
			}
			System.out.println("�ļ���С��"+file.length());
			long time = file.lastModified();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String formattime = format.format(new Date(time));
			System.out.println("�ļ�����޸�ʱ�䣺"+formattime);
			if(file.isDirectory()){
				System.out.println("�ļ��Ƿ�Ϊ�ļ��У�"+file.isDirectory());
				Javaa(file);
			}
		}
		}else{System.out.println("�޷�ʶ��");}
	}
}
