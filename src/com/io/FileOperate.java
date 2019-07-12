package com.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;

public class FileOperate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�ļ�·��
		String path="e:/16_subin";
		java.io.File file=new java.io.File(path);
		if(file.isDirectory()){//�ж��ļ��Ƿ��ļ��У�isFile�ж��Ƿ�Ϊ�ļ�
			//file.listFiles()��ȡĿ¼�µ������ļ���file.listFiles(FilenameFilter��ȡĿ¼��ָ����ʽ���ļ�
			for (java.io.File string : Objects.requireNonNull(file.listFiles(new FilenameFilter() {

				@Override
				public boolean accept(java.io.File dir, String name) {
					//System.out.println(dir.getAbsolutePath()+name);//dir����֮ǰ��·����
					return (new java.io.File(dir, name).isFile() && name.endsWith("txt"));
				}
			}))) {
				System.out.println(string.getAbsolutePath());
			}
		}
	}

}
