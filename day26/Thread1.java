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
	private final int len = 1024;//缓存区大小
	private File file;//要保存的文件
	private int start;//下载保存的开始位置
	private int end;//下载结束的位置
	private DataInputStream is;//读取的网上文件的流
	private URL url;
	private URLConnection con;
	private int downLength = 0;
	public Thread1(String name,File file,URL url,int start,int end){
		super(name);//线程名称
		this.url = url;//要下载的文件的地址
		this.file = file;//下载后文件保存位置
		this.start = start;//开始位置
		this.end = end;//结束位置
	}
	public int getDownLength() {
		return downLength;
	}
	@Override
	public void run() {
		try {

			//文件的分段写入读取，在这个地方用于文件的写入		//因为要从文件的中间部分开始写，此处使用了文件随机访问流
			RandomAccessFile access = new RandomAccessFile(file, "rw");
			int needLength = end - start;
			System.out.println(
			Thread.currentThread().getName()+"下载文件的开始："+start+"下载文件的结束："+end);
			con = url.openConnection();//打开网络连接
			is = new DataInputStream(con.getInputStream());//将输入流分装成字节流
			access.seek(start);//文件开始写的位置
			is.skip(start);//从流中开始读的位置
			//从流中读取字节，然后将字节写入到目标文件
			//创建一个字节缓冲数组
			byte[] buffer = new byte[len];
			int num = is.read(buffer);
			//从is中读取了num个字节 将num个字节放入到buffer中
			while(num!=-1){
				downLength += num;
				System.out.println(getName()+"该线程的下载量"+downLength);
				//用来处理最后不整除的情况
				if(downLength > needLength){//当前已下载量+缓存长度  是否大于 线程需要下载的长度
					//只有最后一次读取可能会读取多出一部分字节
					access.write(buffer,0,num-(downLength-needLength));//将剩余的内容写入文件
					downLength = needLength;
					break;
				}else{
					access.write(buffer, 0, num);//写文件
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
