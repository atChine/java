package suzhu;
import java.util.Scanner;

public class SUZHU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] numbera=new int[10];
		int x; 
		x= in.nextInt();
		while(x!=-1)
		{
			if(x>=0 && x<=9)
			{
				numbera[x]++;
			}
			x=in.nextInt();
		}
		for(int i=0;i<numbera.length;i++)
		{
			System.out.println(i+":"+numbera[i]);
		}
	}
}
