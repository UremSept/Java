package day24;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
	public static void main(String[] args) {
		
		try {
			InetAddress address = InetAddress.getLocalHost();//��ȡ����IP��ַ
			String add = address.getHostAddress();//��ȡ����������������IP��ַ
			System.out.println(address);
			System.out.println(add);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
