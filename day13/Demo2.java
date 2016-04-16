package day13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) {
		//国家的英文简称 对应国家的全称
		HashMap<String,String> countries = new HashMap<String,String>();
		countries.put("CN", "中华人民共和国");//添加新的映射关系
		countries.put("US", "美利坚合众国");
		countries.put("RU", "俄罗斯联邦");
		countries.put("UK", "英国");
		countries.put("UK", "大不列颠和北爱尔兰联合王国");//替换旧的映射关系的键值
		System.out.println(countries.size());//countries的长度
		System.out.println(countries.get("UK"));//输出新的映射关系的键值
		Set<String> keys=countries.keySet();//得到map的所有的key
		Iterator<String> iterator = keys.iterator();//得到key的迭代器
		while(iterator.hasNext()){//进行迭代
			String key = iterator.next();//得到迭代的key
			System.out.print(key+":");
			System.out.println(countries.get(key));//打印key对应的值
		}
		Collection<String> collection = countries.values();//得到map的所有键值
		Iterator<String> iteratorValues = collection.iterator();//得到values的值
		while(iteratorValues.hasNext()){//进行迭代
			System.out.println(iteratorValues.next());
		}

	}

}
