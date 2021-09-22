package com.Exce01;

public class StduentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puplc puplc=new Puplc();
		puplc.name="小明";
		puplc.age=12;
		puplc.socer=66.6;
		puplc.testing();
		puplc.showInfo();
		
		System.out.println("===============");
		
		Graduate graduate =new Graduate();
		graduate.name="大明";
		graduate.age=21;
		graduate.socer=100;
		graduate.testing();
		graduate.showInfo();
	}

}
