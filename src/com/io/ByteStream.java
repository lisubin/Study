package com.io;
/**
 * 文件的读写
 * 1.字节流，字符流  FileOutputStream\FileInputStream，FileWriter\FileReader 
 * 字节流可以进行任何格式的转换，字符流只可以是纯文本的读写
 * 2.缓冲流  BufferedOutputStream\BufferedInputStream,BufferedWriter\BufferdReader
 * 缓冲流是对节点流的增强，可以增加性能
 * 3.转换流，字节流转换为字符流，处理乱码和解码
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
		File file=new File(path);//选定要写入文件的路径
		OutputStream outputStream=null;//定义输出流
		try {
			//BufferedOutputStream处理流，增加节点流的性能
			outputStream=new BufferedOutputStream(new FileOutputStream(file,false));//true 标识在文件里追加内容，false标识覆盖
			String info ="sdfkjakdlsfjalskfklsdfjsalk\n";//要写入的内容
			byte[] bs=info.getBytes();//将字符串转换为字符数组
			outputStream.write(bs,0,info.length());
			outputStream.flush();//强制刷新出去
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
	 * ...代表可变数组
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
	
	public static void read(String path){//文件路径
		File file = new File(path);
		InputStream inputStream=null;
		try {
			//BufferedInputStream处理流，增加节点流的性能
			inputStream =new BufferedInputStream(new FileInputStream(file));//文件输入流
			Pattern pattern=Pattern.compile("href=\"(.+?)\"");
			
			byte[] bs=new byte[1024];//缓冲数组
			int len=0;//接收实际读取的大小
			while((len=inputStream.read(bs))!=-1){//循环读取
				String infoString=new String(bs,0,len);//将字节转换成字符串
				Matcher matcher=pattern.matcher(infoString);
				while(matcher.find()){
				System.out.println(matcher.group(1));}
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("文件找不到");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("文件读取失败");
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
