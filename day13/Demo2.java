package day13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) {
		//���ҵ�Ӣ�ļ�� ��Ӧ���ҵ�ȫ��
		HashMap<String,String> countries = new HashMap<String,String>();
		countries.put("CN", "�л����񹲺͹�");//����µ�ӳ���ϵ
		countries.put("US", "��������ڹ�");
		countries.put("RU", "����˹����");
		countries.put("UK", "Ӣ��");
		countries.put("UK", "���еߺͱ���������������");//�滻�ɵ�ӳ���ϵ�ļ�ֵ
		System.out.println(countries.size());//countries�ĳ���
		System.out.println(countries.get("UK"));//����µ�ӳ���ϵ�ļ�ֵ
		Set<String> keys=countries.keySet();//�õ�map�����е�key
		Iterator<String> iterator = keys.iterator();//�õ�key�ĵ�����
		while(iterator.hasNext()){//���е���
			String key = iterator.next();//�õ�������key
			System.out.print(key+":");
			System.out.println(countries.get(key));//��ӡkey��Ӧ��ֵ
		}
		Collection<String> collection = countries.values();//�õ�map�����м�ֵ
		Iterator<String> iteratorValues = collection.iterator();//�õ�values��ֵ
		while(iteratorValues.hasNext()){//���е���
			System.out.println(iteratorValues.next());
		}

	}

}
