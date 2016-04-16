package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {
	public static void main(String[] args) {
			try {
				ServerSocket server = new ServerSocket(8080);//TCP/IPЭ�飬��������ָ���Ķ˿�
				System.out.println("�������������ȴ���������");
				Socket socket = server.accept();//�ڴ˴���������ֱ��ָ���˿ڽ������ӣ��������Ӻ󣬷���һ���׽���
				System.out.println("����������");
				ReadThread readThread = new ReadThread(socket);
				WriteThread writeThread = new WriteThread(socket);
				readThread.start();
				writeThread.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//�����������׽���
	}
}
