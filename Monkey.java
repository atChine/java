
public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*time=10 n=1;
		 *time=9,n=1,m=4
		 *time=8,n=4,m=10
		 *time=7,n=10,m=22;
		 * 
		 * 
		 */
		E e=new E();
		int a=e.eatday(9);
		System.out.println(a);
		
		
	}

}
	class E{
		public int eatday(int n) {
			if(n==10)
			{
				return 1;
			}
			else
			{
				return 2*(eatday(n+1)+1);
			}
		}
	}