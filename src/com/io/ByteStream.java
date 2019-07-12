package com.io;
/**
 * �ļ��Ķ�д
 * 1.�ֽ������ַ���  FileOutputStream\FileInputStream��FileWriter\FileReader 
 * �ֽ������Խ����κθ�ʽ��ת�����ַ���ֻ�����Ǵ��ı��Ķ�д
 * 2.������  BufferedOutputStream\BufferedInputStream,BufferedWriter\BufferdReader
 * �������ǶԽڵ�������ǿ��������������
 * 3.ת�������ֽ���ת��Ϊ�ַ�������������ͽ���
 *
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.sound.midi.VoiceStatus;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class ByteStream {
	public static void main(String[] args){
		//read("e:/16_subin/3.txt");
		//write("e:/16_subin/3.txt");
		read("baidu1.html");
   
			
	
	}
	
	private static void write(String path) {
		File file=new File(path);//ѡ��Ҫд���ļ���·��
		OutputStream outputStream=null;//���������
		try {
			//BufferedOutputStream�����������ӽڵ���������
			outputStream=new BufferedOutputStream(new FileOutputStream(file,false));//true ��ʶ���ļ���׷�����ݣ�false��ʶ����
			String info ="sdfkjakdlsfjalskfklsdfjsalk\n";//Ҫд�������
			byte[] bs=info.getBytes();//���ַ���ת��Ϊ�ַ�����
			outputStream.write(bs,0,info.length());
			outputStream.flush();//ǿ��ˢ�³�ȥ
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(outputStream!=null){
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	/*
	 * ...����ɱ�����
	 */
	
	public void close(Closeable... aCloseables){
		for(Closeable a:aCloseables){
			try {
				a.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void read(String path){//�ļ�·��
		File file = new File(path);
		InputStream inputStream=null;
		try {
			//BufferedInputStream�����������ӽڵ���������
			inputStream =new BufferedInputStream(new FileInputStream(file));//�ļ�������
			Pattern pattern=Pattern.compile("href=\"(.+?)\"");
			
			byte[] bs=new byte[1024];//��������
			int len=0;//����ʵ�ʶ�ȡ�Ĵ�С
			while((len=inputStream.read(bs))!=-1){//ѭ����ȡ
				String infoString=new String(bs,0,len);//���ֽ�ת�����ַ���
				Matcher matcher=pattern.matcher(infoString);
				while(matcher.find()){
				System.out.println(matcher.group(1));}
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("�ļ��Ҳ���");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		}finally{
			if(inputStream!=null){
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
