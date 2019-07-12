package com.tcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Socket socket=new Socket("localhost",8888);//��������
			
			//���ÿ���̨����
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			String infoString=bufferedReader.readLine();
	
			
			//��������
			DataOutputStream dataOutputStream=new DataOutputStream(socket.getOutputStream());
			dataOutputStream.writeUTF(infoString);
			dataOutputStream.flush();
		
			//��������
			DataInputStream dataInputStream=new DataInputStream(socket.getInputStream());
			String msg=dataInputStream.readUTF();
			System.out.println(msg);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}}


