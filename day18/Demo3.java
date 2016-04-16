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
		 * 生成Json
		 */
		//生成JsonObject对象
//		JSONObject object=new JSONObject();
//		//向其中添加String内容
//		object.accumulate("clazzName", "一年级二班");
//		//生成JsonArray对象
//		JSONArray students=new JSONArray();
//		Student zhangsan=new Student("张三", "18", "男");
//		Student lisi=new Student("李四", "23", "女");
//		Student wangwu=new Student("王五", "10", "男");
//		Student zhaoliu=new Student("赵六", "30", "女");
//		//向JsonArray对象中添加数据
//		students.add(zhangsan);
//		students.add(lisi);
//		students.add(wangwu);
//		students.add(zhaoliu);
//		//将JsonArray对象添加到最初的JsonObject对象中
//		object.accumulate("clazz", students);
//		//输出生成的Json的内容
//		System.out.println(object.toString());
		
		/**
		 * 解析Json
		 */
		//将Json文件中的内容全部读取出来，存放在字符串中
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("src\\day18\\myjson")));
			String str="";
			String line=br.readLine();
			while (line!=null) {
				str+=line;
				line=br.readLine();
			}
			//读取Json文件，并获取Json的object
			JSONObject object2=JSONObject.fromObject(str);
			System.out.println(object2.getString("clazzName"));
			System.out.println();
			//获取jsonobject中的jsonarray对象
			JSONArray students2=object2.getJSONArray("clazz");
			//遍历jsonarray对象中的所有jsonobject元素，获取并输出其值
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
