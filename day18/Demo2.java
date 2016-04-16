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
		SAXParserFactory factory = SAXParserFactory.newInstance();//创建一个解析工厂
		try {
			SAXParser parser = factory.newSAXParser();//用解析工厂实例化解析器
			//Dom将文件生成一个倒挂树，将文件加载到内存中
			//SAX通过一系列事件进行解析，不会将文档加载到内存中
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
