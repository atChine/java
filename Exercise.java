
public class Exercise {

	public static void main(String[] args) {
		A01 a01=new A01();
		double arr[]= null;//{};
		Double res=a01.max(arr);
		if(res!=null)
		{
		System.out.println("arr�����ֵΪ="+a01.max(arr));
		}
		else {
			System.out.println("�����arrֵ����");
		}
	}

}

class A01{
	public Double max(double[] arr) {
		if(arr!=null && arr.length>0) {
			double max=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
			return max;
			}
		else
		return null;
	}
}