package day18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Demo3 {
	public static void main(String[] args) {
		/**
		 * ����Json
		 */
		//����JsonObject����
//		JSONObject object=new JSONObject();
//		//���������String����
//		object.accumulate("clazzName", "һ�꼶����");
//		//����JsonArray����
//		JSONArray students=new JSONArray();
//		Student zhangsan=new Student("����", "18", "��");
//		Student lisi=new Student("����", "23", "Ů");
//		Student wangwu=new Student("����", "10", "��");
//		Student zhaoliu=new Student("����", "30", "Ů");
//		//��JsonArray�������������
//		students.add(zhangsan);
//		students.add(lisi);
//		students.add(wangwu);
//		students.add(zhaoliu);
//		//��JsonArray������ӵ������JsonObject������
//		object.accumulate("clazz", students);
//		//������ɵ�Json������
//		System.out.println(object.toString());
		
		/**
		 * ����Json
		 */
		//��Json�ļ��е�����ȫ����ȡ������������ַ�����
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("src\\day18\\myjson")));
			String str="";
			String line=br.readLine();
			while (line!=null) {
				str+=line;
				line=br.readLine();
			}
			//��ȡJson�ļ�������ȡJson��object
			JSONObject object2=JSONObject.fromObject(str);
			System.out.println(object2.getString("clazzName"));
			System.out.println();
			//��ȡjsonobject�е�jsonarray����
			JSONArray students2=object2.getJSONArray("clazz");
			//����jsonarray�����е�����jsonobjectԪ�أ���ȡ�������ֵ
			for (int i = 0; i < students2.size(); i++) {
				JSONObject student=students2.getJSONObject(i);
				System.out.println(student.getString("name"));
				System.out.println(student.getString("age"));
				System.out.println(student.getString("sex"));
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
