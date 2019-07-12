package com.qq.compare;

import java.util.Comparator;
/**
 * 业务层排序3级排序
 * 先按时间排序（降）再按点击量（升序
 * @author Administrator
 *
 */

public class NewItemCom implements Comparator<NewItem> {

	@Override
	public int compare(NewItem o1, NewItem o2) {
		int result=0;
		result=-o1.getPutTime().compareTo(o2.getPutTime());//降序
		if(result==0){//如果时间相同
			//点击量排
			result=-o1.getClick()-o2.getClick();//升序
			if(result==0)//如果点击量一样
				//标题排
			result=-o1.getTitleString().compareTo(o2.getTitleString());//降序
		}
		return result;
	}

}
