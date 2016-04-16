package day15;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter{

	@Override
	public boolean accept(File arg0) {
		// TODO Auto-generated method stub
		return arg0.getName().endsWith(".txt");
	}
	
}
