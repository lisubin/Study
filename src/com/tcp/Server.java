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
		ServerSocket serverSocket=new ServerSocket(8888);//����������
		
		
		while(true){
		Socket socket=serverSocket.accept();//��������
		System.out.println("һ���ͻ������ӳɹ�");
		

		//������
		DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
		String msg=dataInputStream.readUTF();
		
		//�����
		DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
		dataOutputStream.writeUTF("������-->"+msg);
		dataOutputStream.flush();
		//dataOutputStream.close();
	} 
	}

}
