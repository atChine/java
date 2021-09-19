package student;

import java.util.Scanner;

public class StudentsTeat {
	public static void main(String[] args) {
		
		int sum=0;
		double vag=0;
		//键入个人信息
		Scanner in = new Scanner(System.in);
		Students[] arr=new Students[4];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("请输入第"+(i+1)+"个同学的信息:");
			arr[i]=new Students();
			System.out.print("姓名:");
			arr[i].setName(in.next());
			System.out.print("年龄:");
			arr[i].setAge(in.nextInt());
			System.out.print("班级:");
			arr[i].setClasses(in.next());
			System.out.print("成绩:");
			arr[i].setScore(in.nextInt());
		}
		
		double max=arr[0].getScore();
		double min=arr[0].getScore();
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i].getScore())
			{
				max=arr[i].getScore();
			}
			if(min>arr[i].getScore())
			{
				min=arr[i].getScore();
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(max==arr[i].getScore())
			{
				System.out.println(arr[i].getName()+"的成绩是最强的，他的成绩为:"+max);
			}
			if(min==arr[i].getScore()) 
			{
				System.out.println(arr[i].getName()+"的成绩是最拉的，他的成绩为:"+min);
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i].getScore();  
		}
		vag=sum/arr.length;
		System.out.println("总分为:"+sum);
		System.out.println("评价分为:"+vag);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}