package com.qq.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Text {
	static List<NewItem> list;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ʵ������а�������
		NewItem newItem=new NewItem("ksdlaf",new Date(),100000);
		
		list=new ArrayList<NewItem>();
		list.add(newItem);
		list.add(new NewItem("sfa",new Date(System.currentTimeMillis()-60*60*100),10000));
		list.add(new NewItem("asd",new Date(System.currentTimeMillis()-60*60*100),1000));
		System.out.println(list);
		Collections.sort(list, new NewItemCom());//��������ķ����������趨��ҵ���������
		System.out.println(list);
		
		//ð������
		int[] b={5,4,6,1,8};
		int size=0;
		boolean ss=true;
		for (int i = 0; i < b.length-1; i++) {//�ܵ�����
			ss=true;//��������
			for (int j = 0; j < b.length-i-1; j++) {//ÿ�������Ĵ���			
				size++;	
				if(b[j]>b[j+1]){
					int s;
					s=b[j];
					b[j]=b[j+1];
					b[j+1]=s;
					ss=false;//�趨����
			
				}
				System.out.println("��"+i+"�Σ�"+Arrays.toString(b));
			
			}
			if(ss)
				break;//һ���������������ѭ��
			
		}
		
		System.out.println(size+"");
		


	}

}
