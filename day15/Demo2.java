package day15;

import java.io.File;
import java.io.FileFilter;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("D:/test");
		File[] list = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File arg0) {
				// TODO Auto-generated method stub
				return arg0.getName().endsWith(".txt");
			}
		});
/*		for(File file:list){
			if(file.getName().endsWith(".txt"))
			System.out.println(file.getName());
		}*/
/*		for(File file:list){
			if(new MyFileFilter().accept(file))
			System.out.println(file.getName());
		}*/
		for(File file:list){
			System.out.println(file.getName());
		}
	}

}
