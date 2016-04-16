package day17;

import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();//创建一个工厂
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();//创建一个解析器，用工厂实例化
			Document document = builder.parse(new File("D:\\javac\\lzjtu\\src\\day17\\XMLTest.xml"));//创建一个倒挂树，用解析器解析后的倒挂树实例化
			NodeList list = document.getElementsByTagName("student");//标签清单： Document找到指定的标签，并且放在list中
			System.out.println(list.getLength());
			ArrayList<Student> clazz = new ArrayList<Student>();
			for(int i = 0;i<list.getLength();i++){
				Node node = list.item(i);//得到第i个student的标签
				Student student = new Student();
				
				NodeList children = node.getChildNodes();//得到student的第所有子标签
//				while(child!=null){
//					
//				}
				//System.out.println(children.getLength());
				for(int j = 0;j <children.getLength();j++){
					Node child = children.item(i);
					if(child.getNodeType() == Node.ELEMENT_NODE){
						String nodeName = child.getNodeName();//得到元素的名称；
						System.out.println(nodeName);
						String value = child.getFirstChild().getNodeValue();
						System.out.println(value);
						if(nodeName.equals("name")){
							student.setName(value);
						}else if(nodeName.equals("age")){
							student.setAge(value);
						}else if(nodeName.equals("sex")){
							student.setSex(value);
						}
					}
				}
				clazz.add(student);
			}
			for(Student a:clazz){
				System.out.println(a);
			}
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
