package tast;

import java.io.InputStream;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
//		Scanner in=new Scanner(System.in);
////		System.out.println("Tom"+in.nextLine());
//		System.out.print("������Ʊ�棺");
//		int amount=in.nextInt();
//
//		System.out.print("�������");
//		int prise=in.nextInt();
//		
//		
//		System.out.println(amount+"-"+prise+"="+(amount-prise));
//		double foot;
//		double inch;
//		Scanner in =new Scanner(System.in);
//		System.out.print("������Ӣ�ߣ�");
//		foot=in.nextDouble();
//		System.out.print("������Ӣ�磺");
//		inch=in.nextDouble();
//		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
//		
//		int i=(20.0/5);
//		System.out.print(i);
//		
//		while(true)
//		{
//			final int AGE=35;
//			System.out.println("�������������");
//			Scanner in =new Scanner(System.in);
//			int age=in.nextInt();
//			System.out.println("���������"+age);
//			if(age<=35)
//			{
//				System.out.println("�㻹������");
//			}
//			else {
//				System.out.println("������");
//			}
//			
//		}
//		
//			int count=0;
//			int mun;
//			System.out.println("�������������");
//			Scanner in =new Scanner(System.in);
//			mun=in.nextInt();
//			do
//			{
//			mun=mun/10;
//			count++;
//			}while(mun>0);
//			System.out.println("�������"+count+"λ");
//		int count = 10;
//		do {
//		    System.out.println(count);
//		    count = count -1;
//		} while (count>0);
//		System.out.println("����!");
//		}
		int count=0;
		int num=0;
		Scanner in = new Scanner(System.in);
		int number=(int)(Math.random()*100+1);
		do 
		{
			System.out.print("�����������");
			num=in.nextInt();
			count++;
			if(num>number)
			{
				System.out.println("���´���");
			}
			if(num<number)
			{
				System.out.println("����С��");
			}
			if(num==number)
			{
				System.out.println("���¶���");
				System.out.println("һ������"+count+"��");
			}
			
		}while(number!=num);
	}
}
