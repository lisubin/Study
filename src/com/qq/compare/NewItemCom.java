package com.qq.compare;

import java.util.Comparator;
/**
 * ҵ�������3������
 * �Ȱ�ʱ�����򣨽����ٰ������������
 * @author Administrator
 *
 */

public class NewItemCom implements Comparator<NewItem> {

	@Override
	public int compare(NewItem o1, NewItem o2) {
		int result=0;
		result=-o1.getPutTime().compareTo(o2.getPutTime());//����
		if(result==0){//���ʱ����ͬ
			//�������
			result=-o1.getClick()-o2.getClick();//����
			if(result==0)//��������һ��
				//������
			result=-o1.getTitleString().compareTo(o2.getTitleString());//����
		}
		return result;
	}

}
