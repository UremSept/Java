package day12;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> clazz=new ArrayList<Student>();
		Student lisi=new Student("����",28,'��');
		clazz.add(lisi);
		Student zhangsan=new Student("����",15,'��');
		clazz.add(zhangsan);
		Student wangwu=new Student("����",27,'��');
		clazz.add(wangwu);
		Student wangmazi=new Student("������",16,'��');
		clazz.add(wangmazi);
//		System.out.println(clazz.size());
//		System.out.println(clazz.indexOf(wangwu));
//		System.out.println(clazz.get(3).getName());
//		//System.out.println(clazz.get(8).getName());
//		clazz.remove(wangmazi);
//		System.out.println(clazz.contains(wangmazi));
//		System.out.println(clazz.size());
//		System.out.println(clazz.size());
//		System.out.println(clazz.isEmpty());
//		clazz.clear();
//		System.out.println(clazz.size());
//		System.out.println(clazz.isEmpty());
		//����������
		//ð������
//		Student a=null;
//		for(int i=0;i<clazz.size()-1;i++){
//			for(int j=0;j<clazz.size()-i-1;j++){
//				if(clazz.get(j).getAge()<clazz.get(j+1).getAge()){
//					a=clazz.get(j);
//					clazz.set(j,clazz.get(j+1));
//					clazz.set(j+1,a);
//				}
//			}
//			
//		}
		Collections.sort(clazz,new MyComparator());
		for(Student m:clazz){
			System.out.print(m.getName());
			System.out.print(m.getAge());
			System.out.print(m.getSex());
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
