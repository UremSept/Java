package day24;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPTestServer {
	public static void main(String[] args) {

		try {
			//�����������ݰ���DatagramSocket������ʱֻ��Ҫȷ���˿ںţ������ʼ������ǲ��Ǹ��ҵģ�
			DatagramSocket socket = new DatagramSocket(8080);
			byte[] array = new byte[64*1024];//�������ݰ��Ļ����С
			DatagramPacket packet = new DatagramPacket(array, array.length);//�������ݱ�������Ҫָ�����ĳ��ȣ����õ�����
			System.out.println("��������˼���");
			socket.receive(packet);//�˴��̻߳��������ȴ����ݰ�
			System.out.println("���յ��������ǣ�"+new String(array,0,packet.getLength()));//�����յ����������ͳ��ַ���
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
