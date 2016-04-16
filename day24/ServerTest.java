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
				ServerSocket server = new ServerSocket(8080);//TCP/IP协议，用来侦听指定的端口
				System.out.println("服务器启动，等待建立连接");
				Socket socket = server.accept();//在此处会阻塞，直到指定端口建立连接，建立连接后，返回一个套接字
				System.out.println("建立了连接");
				ReadThread readThread = new ReadThread(socket);
				WriteThread writeThread = new WriteThread(socket);
				readThread.start();
				writeThread.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//服务器监听套接字
	}
}
