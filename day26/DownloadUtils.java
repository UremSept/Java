package day26;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class DownloadUtils {
	public DownloadUtils(String urls,String path){
		download(urls,path,3);
	}
	public DownloadUtils(String urls,String path,int num){
		download(urls,path,num);
	}
	private void download(String urls,String path,int num) {
		try {
			//得到下载文件的URL
			URL url = new URL(urls);
			File file = new File(path);
			if(!file.exists()){
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			URLConnection con = url.openConnection();
			int fileLength = con.getContentLength();//得到要下载的文件的长度
			ArrayList<Thread1> threads = new ArrayList<>();
			for (int i = 0; i < num; i++) {
				if(i<num-1){
					Thread1 thread= new Thread1("线程"+i,file,url,fileLength/num*i,fileLength/num*(i+1));
					thread.start();
					threads.add(thread);
				}else{
					Thread1 thread= new Thread1("线程"+i,file,url,fileLength/num*i,fileLength);
					thread.start();
					threads.add(thread);
				}
			}
			PrcentThread pre = new PrcentThread(threads, fileLength);
			pre.start();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
