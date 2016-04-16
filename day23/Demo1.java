package day23;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Person zhangsan = new Person();
		System.out.println(zhangsan.getName());
		//此时person中不存在一个可以访问的方法去修改姓名
		//可以使用反射去修改zhangsan这个对象的name
		//1得到person的class对象
		Class<Person> person = Person.class;
		try {
			//2得到Person类中名称是name的字段
			Field name = person.getDeclaredField("name");
			//3取消反射时的Java语言访问限制
			name.setAccessible(true);
			//4使用field修改张三的name的值,
			name.set(zhangsan, "张三");
			name.setAccessible(false);
			System.out.println("通过反射修改了张三这个对象的name值，值为："+zhangsan.getName());
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		Class<Person> person = Person.class;
//		Field[] fields = person.getDeclaredFields();
//		System.out.println(fields.length);
//		for(Field field:fields){
//			System.out.println(field.getName());
//		}
//		Method[] methods = person.getDeclaredMethods();
//		System.out.println(methods.length);
//		for(Method method:methods){
//			System.out.println(method.getName());
//		}
	}

}
