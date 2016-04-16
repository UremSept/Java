package day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadThread extends Thread{
	private Socket socket;
	public ReadThread(Socket socket){
		this.socket = socket;
	}
@Override
public void run() {
	while(socket.isConnected()){
		try {
			readFromClient(socket);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
private static void readFromClient(Socket socket) throws IOException {
	InputStream is = socket.getInputStream();
	BufferedReader read = new BufferedReader(new InputStreamReader(is));
	String line = read.readLine();
	System.out.println(line);
}
}
