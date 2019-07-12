package com.network;
/**
 * InetAddress 封装ip和DNS
 * InetSocketAddress 在InetAddress的基础上封装端口
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
		System.out.println(inetAddress.getHostAddress());//解析的ip地址
		System.out.println(inetAddress.getHostName());//名称
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	InetSocketAddress inetSocketAddress=new InetSocketAddress(inetAddress, 8080);
	System.out.println(inetSocketAddress.getPort());//端口号
	inetAddress=inetSocketAddress.getAddress();
	System.out.println(inetAddress.getHostAddress());//解析的ip地址
	System.out.println(inetAddress.getHostName());//名称
}
}
