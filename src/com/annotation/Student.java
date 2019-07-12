package com.annotation;
/**
 * 将类里的值修饰成和表里的值相对应
 * @author Administrator
 *
 */

@STable("tb_student")//
public class Student {
	
	@SField(columnName="id",type="int",length=10)
	private int id;
	@SField(columnName="name",type="varchar",length=20)
	private String name;
	@SField(columnName="age",type="varchar",length=3)
	private String age;
	

	public Student(){
		
	}
	
	
	
	
	public Student(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}




	@Override
	public String toString() {
		return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
	
	

}
