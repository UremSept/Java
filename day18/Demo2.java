package day18;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXParserFactory factory = SAXParserFactory.newInstance();//����һ����������
		try {
			SAXParser parser = factory.newSAXParser();//�ý�������ʵ����������
			//Dom���ļ�����һ�������������ļ����ص��ڴ���
			//SAXͨ��һϵ���¼����н��������Ὣ�ĵ����ص��ڴ���
			MyHandler handler = new MyHandler();
			parser.parse(new File("D:\\javac\\lzjtu\\src\\day18\\XMLTest.xml"),handler);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
