package student;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		T t=new T();
		
		t.test(4);
		
		int res=t.factorial(5);
		System.out.println(res);
		
		
		int sum=t.fbqn(7);
		System.out.println(sum);
	}
	

}
class T{
	public void test(int n) {
		if(n>2)
		{
			test(n-1);
		}
		System.out.println("n= "+n);
	}
	
	public int factorial(int n) {
		if(n==1)
		{
			return 1;
		}
		else
		{
			return(factorial(n-1)*n);
		}
	}
	
	public int fbqn(int n) {
	if(n>=1) {
		if(n==1 || n==2)
		{
			return 1;
		}
		else 
		{
			return (fbqn(n-1)+fbqn(n-2));
		}
	}
	else {
		System.out.println("你输入的数有误");
		return -1;
	}
	
	
	
	
	
	
	}
	
}