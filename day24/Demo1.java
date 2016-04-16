package day24;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo1 {
	public static void main(String[] args) {
		
		try {
			InetAddress address = InetAddress.getLocalHost();//获取本机IP地址
			String add = address.getHostAddress();//获取本机主机名和主机IP地址
			System.out.println(address);
			System.out.println(add);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
