package day16;

import java.io.*;

public class Demo1 {
	public static void main(String[] args) {
/*		//��һ���ַ���д�뵽�ļ���
 *�ȴ���һ���ļ�
 *�ڴ���һ������������ļ�����ȥ
 *�����������write������ָ�����ַ�����д���ļ���
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
 * �ļ�����
 * ���������ļ�
 * һ��ΪԴ�ļ�
 * һ��ΪĿ���ļ�
 * ����һ��������A������һ�������
 * A.read()������ȡ
 * B.write����д
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
//�ļ��ַ�����	
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
		
//���ַ���д�뵽�ļ��У���BufferedWriter		
/*		File file = new File("D:/test/bb.txt");
		String s = "ÿ�ε��� InputStreamReader �е�һ�� read() �������ᵼ�´ӵײ�" +
				"��������ȡһ�������ֽڡ�Ҫ���ô��ֽڵ��ַ�����Чת����������ǰ�ӵײ���" +
				"��ȡ������ֽڣ�ʹ�䳬�����㵱ǰ��ȡ����������ֽڡ� Ϊ�˴ﵽ���Ч�ʣ�" +
				"��Ҫ������ BufferedReader �ڰ�װ InputStreamReader�����磺";
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
		/*��дϵͳ�����������
		File file = new File("D:/test/bb.txt");
		try{
			PrintStream ps = new PrintStream(file);//��׼�����
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
