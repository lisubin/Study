package com.qq.compare;


import java.util.Date;

/**
 * ����ʵ����
 * 
 * @author Administrator
 * 
 */

public class NewItem{
	// ���ű���
	private String titleString;
	// ����ʱ��
	private Date putTime;
	// �����
	private int click;

	public NewItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NewItem(String titleString, Date putTime, int click) {
		super();
		this.titleString = titleString;
		this.putTime = putTime;
		this.click = click;
	}

	public String getTitleString() {
		return titleString;
	}

	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}

	public Date getPutTime() {
		return putTime;
	}

	public void setPutTime(Date putTime) {
		this.putTime = putTime;
	}

	public int getClick() {
		return click;
	}

	public void setClick(int click) {
		this.click = click;
	}

	@Override
	public String toString() {
		return "NewItem \n[click=" + click + "\n putTime=" + putTime
				+ "\n titleString=" + titleString + "]\n";
	}
	

}
