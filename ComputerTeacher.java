package com.atgao;

import java.io.Serializable;

public class ComputerTeacher extends Teacher implements Serializable{

	@Override
	public String work() {
		return "我是计算机老师";
	}
	public ComputerTeacher(String name, String addr, String project, int age) {
		super(name, addr, project, age);
	}
	
}
