package day12;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;



public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getTime());
		SimpleDateFormat Format=new SimpleDateFormat("yyyy年MM月dd日 HH：mm");
		String s=Format.format(date);
		System.out.println(s);
		for(String m:args){
			System.out.println(m);
		}
		System.out.println(Math.abs(-5));//返回 值的绝对值。
		System.out.println(Math.cbrt(28));// 返回值的立方根。
		System.out.println(Math.ceil(1.6));//(入)返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。
		System.out.println(Math.ceil(1.1));
		System.out.println(Math.floor(2.3));//（舍）返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数。
		System.out.println(Math.floor(3.9));
		System.out.println(Math.round(8.9));//四捨五入
		System.out.println(Math.round(9.1));
		System.out.println(Math.max(1,5));
		System.out.println(Math.min(86,26));
		System.out.println(Math.PI);
		System.out.println(Math.E);	
		System.out.println(Math.toRadians(180));//求數字對應的角度值（0-PI）
		System.out.println(Math.toDegrees(Math.PI));//求角度值（0-PI）對應的數字


		
		
	}

}
