package com.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;

public class FileOperate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//文件路径
		String path="e:/16_subin";
		java.io.File file=new java.io.File(path);
		if(file.isDirectory()){//判断文件是否文件夹，isFile判断是否为文件
			//file.listFiles()读取目录下的所有文件，file.listFiles(FilenameFilter读取目录下指定格式的文件
			for (java.io.File string : Objects.requireNonNull(file.listFiles(new FilenameFilter() {

				@Override
				public boolean accept(java.io.File dir, String name) {
					//System.out.println(dir.getAbsolutePath()+name);//dir就是之前的路径名
					return (new java.io.File(dir, name).isFile() && name.endsWith("txt"));
				}
			}))) {
				System.out.println(string.getAbsolutePath());
			}
		}
	}

}
