package tast;

import java.util.Scanner;

public class cd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double meny=100000;
//		int count=0;
//		while(meny>=1000)
//		{
//			if(meny>50000)
//			{
//				meny=meny*0.95;
//				count++;
//			}
//			if(meny<=50000)
//			{
//				meny=meny-1000;
//				count++;
//			}
//		}
//		System.out.println(count);
		
//		Scanner in = new Scanner(System.in);
//		int x=in.nextInt();
//		int a=x%10; //��λ��
//		int b=(x%100)/10;//ʮλ��
//		int c=x/100;//��λ��
//		if(x==a*a*a+b*b*b+c*c*c)
//		{
//			System.out.println("��ˮ�ɻ���");
//		}else
//		{
//			System.out.println("����ˮ�ɻ���");
//		}
//		int count=0;
//		for(int i=1;i<101;i++) {
//			if(i%5!=0) {
//				System.out.print(i+" ");
//				count++;
//				if(count==5)
//				{
//					System.out.println();
//					count=0;
//				}
//			}
//		}
//		
//		double sum=0;
//		for(double  i=1;i<101;i++)
//		{
//			if(i%2==0)
//			{
//				sum=sum+1/(-i);
//			}
//			else {
//				sum=sum+1/i;
//			}
//		}
//		System.out.println(sum);
		
//		double sum1=0.0;
//		//double sum2=0.0;
//		for(int i=1;i<101;i++)
//		{
//			sum1=sum1+1.0/i;
//			sum1=-sum1;
//		}
//		System.out.println(sum1);
		Preson p1=new Preson();
		//p1.sum();
		//p1.sum1(5);
		int returnRet=p1.getSum(5, 6);
		System.out.println(returnRet);
	}
}
