package Exercise;

//������һ����쳲��������е���Ŀ��the key is�ҵ�a[n]=a[n-1]+a[n-3]�Ĺ��ɣ�Ȼ�󴴽�������һ������/������ɡ�
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println(sum(n));
		}

	}

	private static int sum(int n) {
		if (n <= 4) {
			return n;
		}
		return sum(n - 3) + sum(n - 1);
	}
}