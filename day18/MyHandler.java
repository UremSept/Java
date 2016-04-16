package day18;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{
	private ArrayList<Student> clazz;//创建一个班级链表，用来存放学生
	private Student student;//创建一个学生
	private String tagName;
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("SAX文档解析开始");
		clazz = new ArrayList<Student>();
	}
	
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		System.out.println(qName+"标签解析开始");
		tagName = qName;
		if("student".equals(qName)){
			student = new Student();
			String num = attributes.getValue("num");
			System.out.println("学生的学号："+num);
		}
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		String value = new String(ch, start, length);
		System.out.println("上一个开始标签的值："+tagName+"    文本："+value);
		//需要判断是上一个开始标签的名称即qName是什么
		if("name".equals(tagName))
			student.setName(value);
		else if("age".equals(tagName))
			student.setAge(value);
		else if("sex".equals(tagName))
			student.setSex(value);
//		else if("xuehao".equals(tagName))
//			student.setXuehao(value);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		System.out.println(qName+"标签解析结束");
		//tagName=null;
		tagName=null;
		if("student".equals(qName))
			clazz.add(student);
		
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("SAX文档解析结束");
		for(Student a:clazz){
			System.out.println(a);
		}
	}




	

}
