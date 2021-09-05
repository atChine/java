package tast;

import java.io.InputStream;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
//		Scanner in=new Scanner(System.in);
////		System.out.println("Tom"+in.nextLine());
//		System.out.print("请输入票面：");
//		int amount=in.nextInt();
//
//		System.out.print("请输入金额：");
//		int prise=in.nextInt();
//		
//		
//		System.out.println(amount+"-"+prise+"="+(amount-prise));
//		double foot;
//		double inch;
//		Scanner in =new Scanner(System.in);
//		System.out.print("请输入英尺：");
//		foot=in.nextDouble();
//		System.out.print("请输入英寸：");
//		inch=in.nextDouble();
//		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
//		
//		int i=(20.0/5);
//		System.out.print(i);
//		
//		while(true)
//		{
//			final int AGE=35;
//			System.out.println("请输入你的年龄");
//			Scanner in =new Scanner(System.in);
//			int age=in.nextInt();
//			System.out.println("你的年龄是"+age);
//			if(age<=35)
//			{
//				System.out.println("你还很年轻");
//			}
//			else {
//				System.out.println("你老了");
//			}
//			
//		}
//		
//			int count=0;
//			int mun;
//			System.out.println("请输入你的数字");
//			Scanner in =new Scanner(System.in);
//			mun=in.nextInt();
//			do
//			{
//			mun=mun/10;
//			count++;
//			}while(mun>0);
//			System.out.println("这个数有"+count+"位");
//		int count = 10;
//		do {
//		    System.out.println(count);
//		    count = count -1;
//		} while (count>0);
//		System.out.println("发射!");
//		}
		int count=0;
		int num=0;
		Scanner in = new Scanner(System.in);
		int number=(int)(Math.random()*100+1);
		do 
		{
			System.out.print("请您输入猜数");
			num=in.nextInt();
			count++;
			if(num>number)
			{
				System.out.println("您猜大了");
			}
			if(num<number)
			{
				System.out.println("您猜小了");
			}
			if(num==number)
			{
				System.out.println("您猜对啦");
				System.out.println("一共用了"+count+"次");
			}
			
		}while(number!=num);
	}
}
