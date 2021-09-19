
public class HomeWork02 {

	public static void main(String[] args) {
	
		A02 a02=new A02();
		String str[]= null;
		System.out.println(a02.find("",str));
		

	}

}

class A02{
	public int find(String findstr ,String[]str) {
		if(str!=null) {
		for(int i=0;i<str.length;i++)
		{
			if(findstr.equals(str[i]))
			{   
				return i;	
			}
			
		}
	}
		return -1;
	}
}
