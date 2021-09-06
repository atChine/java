package hello;

import java.util.Scanner;

public class tast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int count=0;
//		for(int n=2;;n++)
//		{
//			int isPrime=1;
//			for(int i=2;i<n;i++)
//			{
//				if(n%i==0)
//				{			
//					isPrime=0;
//					break;
//				}
//			}
//			if(isPrime==1)
//			{
//				System.out.print(n+" ");
//				count++;
//				//break;
//			}
//			if(count==50)
//				break;
//			else 
//			{
//				//System.out.println("²»ÊÇËØÊý");
//			}
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		double sum=0.0;
		int sige=1;
		for(int i=1;i<=n;i++)
		{
			sum=sige*sum+1.0/i;
			sige=-sige;
		}
		System.out.printf("%.2f",sum);
		
		
		
		
		
		
	}
}
