package tast;

import java.util.Scanner;

public class Preson {
	
	public void sum() {
		int sum=0;
		for(int i=1;i<1001;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	
		
		public void sum1(int n) {
			int sum=0;
			for(int i=1;i<n;i++)
			{
				sum=sum+i;
			}
			System.out.println(sum);
		}
		
		public int getSum(int num1,int num2) {
			int ret=num1+num2;
			return ret;
		}
//	public void sum1() {
//		Scanner in=new Scanner(System.in);
//		int sum=0;
//		int n=in.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//			sum=sum+i;
//		}
//		System.out.println(sum);
//	}

}
