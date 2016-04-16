package day24;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPTestClient {
	public static void main(String[] args) {
		try {
			//创建发送数据包的DatagramSocket（可以理解为信封）
			DatagramSocket socket = new DatagramSocket();
			//数据（信的内容）
			String data = "我是一条数据报包";
			//创建目标服务端IP地址，（可以理解为找到目标地址）
			InetAddress address = InetAddress.getByAddress(new byte[]{(byte) 172,6,1,(byte) 148});
			//创建发送的数据包，包中包含数据 数据长度 服务端IP的地址 服务端的端口号（可以理解为将信的内容，长度，要送的地址写到信封上，并装里面）
			DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length, address,8080);
			socket.send(packet);//发送数据报包（把信送出去）
			System.out.println("已发送数据");
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
