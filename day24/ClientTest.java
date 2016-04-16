package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class ClientTest {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("172.6.1.145",8080);//TCP/IPЭ�飬��Ŀ���ַ�������ӣ�����һ���׽��֣��������Ϊ�����뷢�ͷ�֮���һ���ܵ���
			System.out.println("�ͻ������ӷ�����");
			ReadThread readThread = new ReadThread(socket);//����һ���߳�������������
			WriteThread writeThread = new WriteThread(socket);//����һ���߳�������������
			readThread.start();
			writeThread.start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
