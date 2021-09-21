package com.encap;

public class Account {
	private String name;
	private double balance;
	private String pwd;
	
	//�޲ι�����
	public Account() {
		
	}
	//�вι�����
	public Account(String name, double balance, String pwd) {
		super();
		this.name = name;
		this.balance = balance;
		this.pwd = pwd;
	}
	
	
	//set()��get()����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()>=2 && name.length()<=6)
		{
		this.name = name;
		}else{
			this.name="����";
			System.out.println("ֻ������2-6λ��������");
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













