package day25;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import java.util.RandomAccess;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URL url = new URL("http://i3.sinaimg.cn/home/2013/0331/U586P30DT20130331093840.png");
		
			//读出并显示网页内容
			InputStream is = url.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line = reader.readLine();
			while(line!=null){
				System.out.println(line);
				line = reader.readLine();
			}
			
			
			
/*			//通过在 URL 上调用 openConnection 方法创建连接对象。
			URLConnection con = url.openConnection();
			//处理设置参数和一般性请求属性，对网络资源的读取提交
			con.setDoInput(true);//默认值是true
			con.setDoOutput(true);//默认值是false
			//使用connect建立连接
			con.connect();
			//访问内容
			//System.out.println(con.getConnectTimeout());
			InputStream is = con.getInputStream();
			//显示内容
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line = reader.readLine();
			while(line!=null){
				System.out.println(line);
				line = reader.readLine();
			}*/
			
/*//从指定的地址下载文件，此处下载一个图片
			File file = new File("D:/aa.jpg");
			if(!file.exists()){
				file.createNewFile();
			}//判断文件是否存在，不存在则创建
			URLConnection con = url.openConnection();
			con.setDoInput(true);
			con.setDoOutput(true);
			InputStream is = con.getInputStream();
			System.out.println(con.getContentLength());
			DataInputStream dis = new DataInputStream(is);
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
			byte[] array = new byte[1024];
			int index = dis.read(array);
			while(index!=-1){
				dos.write(array,0,index);
				index = dis.read(array);
			}
			dos.flush();
			dos.close();
			dis.close();
			is.close();*/
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
