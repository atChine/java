package com.atgao;

import java.io.Serializable;

public abstract class Teacher implements Serializable{
	private String name;
	private String addr;
	private String project;
	private int age;
	public abstract String work();
	public Teacher(String name, String addr, String project, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.project = project;
		this.age = age;
	}
	public Teacher() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", addr=" + addr + ", project=" + project + ", age=" + age + "]";
	}
	
	
}
