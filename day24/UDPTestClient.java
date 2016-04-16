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
			//�����������ݰ���DatagramSocket���������Ϊ�ŷ⣩
			DatagramSocket socket = new DatagramSocket();
			//���ݣ��ŵ����ݣ�
			String data = "����һ�����ݱ���";
			//����Ŀ������IP��ַ�����������Ϊ�ҵ�Ŀ���ַ��
			InetAddress address = InetAddress.getByAddress(new byte[]{(byte) 172,6,1,(byte) 148});
			//�������͵����ݰ������а������� ���ݳ��� �����IP�ĵ�ַ ����˵Ķ˿ںţ��������Ϊ���ŵ����ݣ����ȣ�Ҫ�͵ĵ�ַд���ŷ��ϣ���װ���棩
			DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length, address,8080);
			socket.send(packet);//�������ݱ����������ͳ�ȥ��
			System.out.println("�ѷ�������");
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
