package com.reflection;

import java.io.ByteArrayOutputStream;
/**
 * 自定义类加载器
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileSystemClassLoader extends ClassLoader{
	private String rootdir;//根目录
	
	public FileSystemClassLoader(String rootdir){
		this.rootdir = rootdir;
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		Class<?> class1 = findLoadedClass(name);
		
		if(class1!=null){
			return class1;
		}else{
			ClassLoader classLoader = this.getParent();//双亲委派机制
			try{
			class1 = classLoader.loadClass(name);
			}catch(Exception e){
			}
			if(class1!=null){
				return class1;
			}else{
				byte[]  classData = getClassData(name);
				if(class1==null){
					throw new ClassNotFoundException();
				}else{
					class1 = defineClass(name, classData, 0, classData.length);
				}
			}
		}
		return class1;
	}

	private byte[] getClassData(String name) {//com.lsb.reflect ->d;//java/com/lsb/reflect
		String pathString = rootdir + name.replace('.', '/')+".class";
		InputStream inputStream = null;
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		
		try {
			inputStream =new FileInputStream(pathString);
			byte[] buffer = new byte[1024];
			int temp = 0;
			try {
				while((temp=inputStream.read(buffer))!=-1){
					byteArrayOutputStream.write(buffer, 0, temp);
				}
				
				return byteArrayOutputStream.toByteArray();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
