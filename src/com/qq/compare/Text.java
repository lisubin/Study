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
		//对实体类进行按需排序
		NewItem newItem=new NewItem("ksdlaf",new Date(),100000);
		
		list=new ArrayList<NewItem>();
		list.add(newItem);
		list.add(new NewItem("sfa",new Date(System.currentTimeMillis()-60*60*100),10000));
		list.add(new NewItem("asd",new Date(System.currentTimeMillis()-60*60*100),1000));
		System.out.println(list);
		Collections.sort(list, new NewItemCom());//调用排序的方法，安照设定的业务排序进行
		System.out.println(list);
		
		//冒泡排序
		int[] b={5,4,6,1,8};
		int size=0;
		boolean ss=true;
		for (int i = 0; i < b.length-1; i++) {//总的趟数
			ss=true;//假设有序
			for (int j = 0; j < b.length-i-1; j++) {//每次趟数的次数			
				size++;	
				if(b[j]>b[j+1]){
					int s;
					s=b[j];
					b[j]=b[j+1];
					b[j+1]=s;
					ss=false;//设定无序
			
				}
				System.out.println("第"+i+"次："+Arrays.toString(b));
			
			}
			if(ss)
				break;//一旦有序就跳出整个循环
			
		}
		
		System.out.println(size+"");
		


	}

}
