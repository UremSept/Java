package day16;

import java.io.*;

public class Demo1 {
	public static void main(String[] args) {
/*		//将一串字符串写入到文件中
 *先创建一个文件
 *在创建一个输出流，将文件传进去
 *用用输出流的write方法将指定的字符数组写到文件中
		File file = new File("D:/test/bb.txt");
		String s = "helloworld!";
		try{
			OutputStream os = new FileOutputStream(file);
			os.write(s.getBytes());
			os.flush();
			os.close();
		}catch(Exception e){
			System.out.println(e);
		}
*/
		
/*
 * 文件拷贝
 * 创建两个文件
 * 一个为源文件
 * 一个为目标文件
 * 创建一个输入流A，创建一个输出流
 * A.read()用来读取
 * B.write用来写
		File file = new File("D:/test/aa.PNG");
		File fileCopy = new File("D:/test/cc.PNG");
		try {
			InputStream is = new FileInputStream(file);
			OutputStream os = new FileOutputStream(fileCopy);
			byte[] array = new byte[1024];
			int b = is.read(array);
			while(b!=-1){
				os.write(array,0,b);
				b = is.read(array);
			}
			os.flush();
			os.close();
			is.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
*/
//文件字符串读	
/*		File file = new File("D:/test/bb.txt");
		try {
			InputStream is = new FileInputStream(file);
			InputStreamReader isreader = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isreader);
			String line = reader.readLine();
			while(line!=null){
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
			isreader.close();
			is.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}*/
		
//将字符串写入到文件中，用BufferedWriter		
/*		File file = new File("D:/test/bb.txt");
		String s = "每次调用 InputStreamReader 中的一个 read() 方法都会导致从底层" +
				"输入流读取一个或多个字节。要启用从字节到字符的有效转换，可以提前从底层流" +
				"读取更多的字节，使其超过满足当前读取操作所需的字节。 为了达到最高效率，" +
				"可要考虑在 BufferedReader 内包装 InputStreamReader。例如：";
		try {
			OutputStream os = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(s);
			bw.flush();
			bw.close();
			osw.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		/*重写系统输入输出方法
		File file = new File("D:/test/bb.txt");
		try{
			PrintStream ps = new PrintStream(file);//标准输出流
			System.setOut(ps);
			System.out.println("niajuaejfkfl;dsakml;fd");
			System.out.println("eropfpaweokfpowekpo");
			
		}catch(Exception e){
			System.out.println(e);
		}
		*/
		File file = new File("D:/test/bb.txt");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
