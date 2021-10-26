package Exercise;

//这题是一个类斐波那契数列的题目，the key is找到a[n]=a[n-1]+a[n-3]的规律，然后创建并调用一个函数/方法完成。
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