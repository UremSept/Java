package day26;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * ���߳������ļ�
 * @author Administrator
 *1.ȷ��Ҫ���ص��ļ���·��
 *2.ȷ��Ҫ��ŵ�λ��
 *3.���ļ��ֳɼ����߳����أ�3���̣߳�1.���ص��ļ��Ĵ�Сλ��0~length/3��length/3~length/3*2,length/3*2~length��
 *---------------------------------randomAccessFile seek(0),randomAccessFile seek(length/3),randomAccessFile seek(length/3*2)
 *4.ѭ��д�룬д��ĳ���=length/3����ʱ���̹߳ر�
 *5.���ؽ��ȣ��Ӷ���߳���ȡ�����ص����ֽ���/length
 */
public class Demo1 {
	public static void main(String[] args) {
		DownloadUtils down = new DownloadUtils("http://i3.sinaimg.cn/home/2013/0331/U586P30DT20130331093840.png", "D:/sss.png", 3);
		
		
	}

	
}
