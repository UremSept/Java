package day18;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{
	private ArrayList<Student> clazz;//����һ���༶�����������ѧ��
	private Student student;//����һ��ѧ��
	private String tagName;
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("SAX�ĵ�������ʼ");
		clazz = new ArrayList<Student>();
	}
	
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		System.out.println(qName+"��ǩ������ʼ");
		tagName = qName;
		if("student".equals(qName)){
			student = new Student();
			String num = attributes.getValue("num");
			System.out.println("ѧ����ѧ�ţ�"+num);
		}
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		String value = new String(ch, start, length);
		System.out.println("��һ����ʼ��ǩ��ֵ��"+tagName+"    �ı���"+value);
		//��Ҫ�ж�����һ����ʼ��ǩ�����Ƽ�qName��ʲô
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
		System.out.println(qName+"��ǩ��������");
		//tagName=null;
		tagName=null;
		if("student".equals(qName))
			clazz.add(student);
		
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("SAX�ĵ���������");
		for(Student a:clazz){
			System.out.println(a);
		}
	}




	

}
