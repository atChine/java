package com.encap;

public class Account {
	private String name;
	private double balance;
	private String pwd;
	
	//无参构造器
	public Account() {
		
	}
	//有参构造器
	public Account(String name, double balance, String pwd) {
		super();
		this.name = name;
		this.balance = balance;
		this.pwd = pwd;
	}
	
	
	//set()和get()方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>=2 && name.length()<=6)
		{
		this.name = name;
		}else{
			this.name="无名";
			System.out.println("只能输入2-6位数的名字");
		}
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void info() {
		System.out.println("name="+name+" balance"+balance+" pwd"+pwd);
	}
}













