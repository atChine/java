package bao;

public class tsts {

	public static void main(String[] args) {
		

	AA a=new AA();
//	if(a.isOdd(3))
//	{
//		System.out.println("ÆæÊý");
//	}else 
//	{
//		System.out.println("Å¼Êý");
//	}
//	
	a.printChar(3, 3, '#');
	
	
	}
}

class AA{
	
	public boolean isOdd(int num) {
		return num%2!=0;
	}
	
	public void printChar(int row,int col,char c) {
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
}