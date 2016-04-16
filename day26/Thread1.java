package day26;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;

public class Thread1 extends Thread{
	private final int len = 1024;//��������С
	private File file;//Ҫ������ļ�
	private int start;//���ر���Ŀ�ʼλ��
	private int end;//���ؽ�����λ��
	private DataInputStream is;//��ȡ�������ļ�����
	private URL url;
	private URLConnection con;
	private int downLength = 0;
	public Thread1(String name,File file,URL url,int start,int end){
		super(name);//�߳�����
		this.url = url;//Ҫ���ص��ļ��ĵ�ַ
		this.file = file;//���غ��ļ�����λ��
		this.start = start;//��ʼλ��
		this.end = end;//����λ��
	}
	public int getDownLength() {
		return downLength;
	}
	@Override
	public void run() {
		try {

			//�ļ��ķֶ�д���ȡ��������ط������ļ���д��		//��ΪҪ���ļ����м䲿�ֿ�ʼд���˴�ʹ�����ļ����������
			RandomAccessFile access = new RandomAccessFile(file, "rw");
			int needLength = end - start;
			System.out.println(
			Thread.currentThread().getName()+"�����ļ��Ŀ�ʼ��"+start+"�����ļ��Ľ�����"+end);
			con = url.openConnection();//����������
			is = new DataInputStream(con.getInputStream());//����������װ���ֽ���
			access.seek(start);//�ļ���ʼд��λ��
			is.skip(start);//�����п�ʼ����λ��
			//�����ж�ȡ�ֽڣ�Ȼ���ֽ�д�뵽Ŀ���ļ�
			//����һ���ֽڻ�������
			byte[] buffer = new byte[len];
			int num = is.read(buffer);
			//��is�ж�ȡ��num���ֽ� ��num���ֽڷ��뵽buffer��
			while(num!=-1){
				downLength += num;
				System.out.println(getName()+"���̵߳�������"+downLength);
				//��������������������
				if(downLength > needLength){//��ǰ��������+���泤��  �Ƿ���� �߳���Ҫ���صĳ���
					//ֻ�����һ�ζ�ȡ���ܻ��ȡ���һ�����ֽ�
					access.write(buffer,0,num-(downLength-needLength));//��ʣ�������д���ļ�
					downLength = needLength;
					break;
				}else{
					access.write(buffer, 0, num);//д�ļ�
				}
				num = is.read(buffer);
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
