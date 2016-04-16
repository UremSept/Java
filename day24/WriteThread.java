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
		Scanner scanner = new Scanner(System.in);//�Ӽ��̶�������
		String s = scanner.nextLine();
		OutputStream os = socket.getOutputStream();//�ڹܵ��д���һ�������
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(os));//�������廯
		writer.write(s+"\n");//���ַ�������ȥ
		writer.flush();
	}
}
