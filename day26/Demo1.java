package day26;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

/**
 * 多线程下载文件
 * @author Administrator
 *1.确定要下载的文件的路径
 *2.确定要存放的位置
 *3.将文件分成几个线程下载（3个线程：1.下载的文件的大小位置0~length/3，length/3~length/3*2,length/3*2~length）
 *---------------------------------randomAccessFile seek(0),randomAccessFile seek(length/3),randomAccessFile seek(length/3*2)
 *4.循环写入，写入的长度=length/3，此时该线程关闭
 *5.下载进度：从多个线程中取得下载的总字节数/length
 */
public class Demo1 {
	public static void main(String[] args) {
		DownloadUtils down = new DownloadUtils("http://i3.sinaimg.cn/home/2013/0331/U586P30DT20130331093840.png", "D:/sss.png", 3);
		
		
	}

	
}
