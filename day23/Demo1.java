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
		//��ʱperson�в�����һ�����Է��ʵķ���ȥ�޸�����
		//����ʹ�÷���ȥ�޸�zhangsan��������name
		//1�õ�person��class����
		Class<Person> person = Person.class;
		try {
			//2�õ�Person����������name���ֶ�
			Field name = person.getDeclaredField("name");
			//3ȡ������ʱ��Java���Է�������
			name.setAccessible(true);
			//4ʹ��field�޸�������name��ֵ,
			name.set(zhangsan, "����");
			name.setAccessible(false);
			System.out.println("ͨ�������޸���������������nameֵ��ֵΪ��"+zhangsan.getName());
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
