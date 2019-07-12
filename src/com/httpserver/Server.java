package com.httpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ������������������
 * @author Administrator
 *
 */
public class Server {
	private ServerSocket serverSocket;
	
	
     public static void main(String[] args) {
		Server server=new Server();
		server.start();
	}
     
     /**
      * ����������
      */
     public void start() {
		try {
			serverSocket=new ServerSocket(8888);
			this.recive();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
     
     /**
      * ���տͻ���
      */
     
     private void recive(){
    	 try {
			Socket socket=serverSocket.accept();
			StringBuilder stringBuilder=new StringBuilder();
			String msg=null;
			
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while((msg=bufferedReader.readLine()).length()>0){
				stringBuilder.append(msg);
				stringBuilder.append("\r\n");
				if(msg==null){
					break;
				}
			}
			
			System.out.println(stringBuilder.toString().trim());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
}
