import org.omg.PortableInterceptor.IORInterceptor;

public class HeavyLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods methods=new Methods();
		System.out.println(methods.m(5));
		System.out.println(methods.m(5, 5));
		System.out.println(methods.m("djfchdsjcf"));
		
	}

}
	class Methods{
		
		int m(int a)
		{
			return a*a;
		}
		int m(int a,int b)
		{
			return a*b;
		}
		String m(String a)
		{
			return a;
		}
}