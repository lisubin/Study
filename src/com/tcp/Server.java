package com.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket=new ServerSocket(8888);//创建服务器
		
		
		while(true){
		Socket socket=serverSocket.accept();//建立连接
		System.out.println("一个客户端连接成功");
		

		//输入流
		DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
		String msg=dataInputStream.readUTF();
		
		//输出流
		DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
		dataOutputStream.writeUTF("服务器-->"+msg);
		dataOutputStream.flush();
		//dataOutputStream.close();
	} 
	}

}
