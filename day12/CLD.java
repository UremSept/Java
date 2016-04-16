package day12;

import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;

public class CLD {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();//date要用new calendar必须要用此方法初始化
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		int time=calendar.get(Calendar.SECOND);
		System.out.println(time);
		System.out.println(year+"年"+month+"月"+day+"日");
		calendar.add(calendar.DAY_OF_MONTH, 10);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		TimeZone TZ = TimeZone.getDefault();
		System.out.println(TZ.getDisplayName());
		Random random1=new Random();
		int i=random1.nextInt(90)+10;
		System.out.println(i);
		boolean a=random1.nextBoolean();
		System.out.println(a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
