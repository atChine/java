package student;

import java.util.Scanner;

public class StudentsTeat {
	public static void main(String[] args) {
		
		int sum=0;
		double vag=0;
		//���������Ϣ
		Scanner in = new Scanner(System.in);
		Students[] arr=new Students[4];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("�������"+(i+1)+"��ͬѧ����Ϣ:");
			arr[i]=new Students();
			System.out.print("����:");
			arr[i].setName(in.next());
			System.out.print("����:");
			arr[i].setAge(in.nextInt());
			System.out.print("�༶:");
			arr[i].setClasses(in.next());
			System.out.print("�ɼ�:");
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
				System.out.println(arr[i].getName()+"�ĳɼ�����ǿ�ģ����ĳɼ�Ϊ:"+max);
			}
			if(min==arr[i].getScore()) 
			{
				System.out.println(arr[i].getName()+"�ĳɼ��������ģ����ĳɼ�Ϊ:"+min);
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i].getScore();  
		}
		vag=sum/arr.length;
		System.out.println("�ܷ�Ϊ:"+sum);
		System.out.println("���۷�Ϊ:"+vag);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}