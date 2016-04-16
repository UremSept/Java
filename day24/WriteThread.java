package day24;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WriteThread extends Thread{
	private Socket socket;
	public WriteThread(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		while(socket.isConnected()){
			try {
				readFromInToClient(socket);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private static void readFromInToClient(Socket socket) throws IOException {
		Scanner scanner = new Scanner(System.in);//从键盘读入数据
		String s = scanner.nextLine();
		OutputStream os = socket.getOutputStream();//在管道中创建一个输出流
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(os));//将流具体化
		writer.write(s+"\n");//将字符串发出去
		writer.flush();
	}
}
