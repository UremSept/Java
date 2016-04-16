package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PeopleFactory {
	public People createPeople(){
		People people = null;
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream("src/day23/config.properties"));
			String classname = pro.getProperty("classname");
			Class clazz = Class.forName(classname);
			people = (People) clazz.newInstance();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return people;
		
		
		
	}
}
