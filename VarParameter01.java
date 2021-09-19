
public class VarParameter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HspMethod hspMethod=new HspMethod();
		
		System.out.println(hspMethod.sum(1,2,7));
		System.out.println(hspMethod.sum(1,2,100));
		
		
		System.out.println(hspMethod.showScore("李华", 80,95.5));
	}

}

class HspMethod{
	
	public int sum(int... num) {
		int res=0;
		for(int i=0;i<num.length;i++)
		{
			res=res+num[i];
		}
		return res;
	}
	
	
	public String showScore(String name,double... num) {
		double sum=0.0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		return name+"的"+num.length+"门的总成绩为:"+sum;
	}
}