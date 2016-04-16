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
			Socket socket = new Socket("172.6.1.145",8080);//TCP/IP协议，与目标地址建立连接，生成一个套接字（可以理解为接收与发送方之间的一条管道）
			System.out.println("客户端连接服务器");
			ReadThread readThread = new ReadThread(socket);//创建一个线程用来接收数据
			WriteThread writeThread = new WriteThread(socket);//创建一个线程用来发送数据
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
