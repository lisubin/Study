package com.network;
/**
 * InetAddress ��װip��DNS
 * InetSocketAddress ��InetAddress�Ļ����Ϸ�װ�˿�
 */
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.net.InetAddress;

public class InetAddressDemo {
	private static InetAddress inetAddress=null;
  public static void main(String[] args) {
	try {
		inetAddress=InetAddress.getLocalHost();
		inetAddress=InetAddress.getByName("www.baidu.com");
		System.out.println(inetAddress.getHostAddress());//������ip��ַ
		System.out.println(inetAddress.getHostName());//����
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	InetSocketAddress inetSocketAddress=new InetSocketAddress(inetAddress, 8080);
	System.out.println(inetSocketAddress.getPort());//�˿ں�
	inetAddress=inetSocketAddress.getAddress();
	System.out.println(inetAddress.getHostAddress());//������ip��ַ
	System.out.println(inetAddress.getHostName());//����
}
}
