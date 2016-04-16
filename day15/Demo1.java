package day15;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
	
	
	public static void main(String[] args) {
		
	
		/*
		//初始化一个文件的方法
		//1
		File file1 = new File("I:/test/text1.txt");
		//2
		File dir = new File("I:/test");
		File file2 = new File(dir,"text1.txt");
		//3
		File file3 = new File("I:/test","text1.txt");
		*/
		
/*		//创建一个新文件夹
		File file4 = new File("D:/test");
		file4.mkdir();//当父目录一定存在时用此方法
		File file5 = new File("D:/test/dd/mm");
		file5.mkdirs();//当父目录不一定存在时，用此方法
		File file6 = new File("D:/test/bb.txt");
		try {
			file6.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//创建一个新文件
*/
		File dir = new File("D:/test");
		Javaa(dir);
	}
	//方法：遍历一个指定的文件夹，判断其中的文件，文件夹
	private static void Javaa(File dir) {
		if(dir.isFile()){
			System.out.println("这是一个文件，不是文件夹");
			return;
		}//判断是不是文件，若是文件则跳出
		if(dir.isDirectory()){
		File[] list = dir.listFiles();//获取文件和目录的清单存到数组中
		for(File file:list){
			System.out.println("文件名称："+file.getName());
			if(file.getName().endsWith(".java")){//endswith判断一个字符串是否是以指定字符串结束
				System.out.println("文件绝对路径："+file.getAbsolutePath());
			}
			System.out.println("文件大小："+file.length());
			long time = file.lastModified();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			String formattime = format.format(new Date(time));
			System.out.println("文件最后修改时间："+formattime);
			if(file.isDirectory()){
				System.out.println("文件是否为文件夹："+file.isDirectory());
				Javaa(file);
			}
		}
		}else{System.out.println("无法识别");}
	}
}
