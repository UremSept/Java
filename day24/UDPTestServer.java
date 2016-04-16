package day24;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPTestServer {
	public static void main(String[] args) {

		try {
			//创建接收数据包的DatagramSocket，接收时只需要确定端口号（接收邮件，看是不是给我的）
			DatagramSocket socket = new DatagramSocket(8080);
			byte[] array = new byte[64*1024];//创建数据包的缓冲大小
			DatagramPacket packet = new DatagramPacket(array, array.length);//接收数据报包，需要指定他的长度，放置的数组
			System.out.println("启动服务端监听");
			socket.receive(packet);//此处线程会阻塞，等待数据包
			System.out.println("接收到的数据是："+new String(array,0,packet.getLength()));//将接收到的数据造型成字符串
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
