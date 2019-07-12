package com.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

public class URLDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedOutputStream bufferedOutputStream=null;
		BufferedInputStream bufferedInputStream=null;
		try {
			URL url=new URL("http://www.87of.com/index.html");//完整的URL路径
			bufferedInputStream=new BufferedInputStream(url.openStream());
			bufferedOutputStream=new BufferedOutputStream(new FileOutputStream("baidu1.html"));
			byte[] s=new byte[1024];
			int len=0;
			while((len=bufferedInputStream.read(s))!=-1){
				bufferedOutputStream.write(s, 0, len);
			}
			bufferedOutputStream.flush();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(bufferedInputStream!=null||bufferedOutputStream!=null){
				try {
					bufferedInputStream.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					bufferedOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}	

}
