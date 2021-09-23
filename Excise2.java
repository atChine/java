package Clock;

import java.util.HashMap;
import java.util.Scanner;

public class Excise2 {
	private HashMap<Integer, String> coinname = new HashMap<>();

	public Excise2() {
		coinname.put(1, "penny");
		coinname.put(10, "dime");
		coinname.put(25, "quarter");
		coinname.put(50, "half-dolar");
		System.out.println(coinname.keySet().size());
		System.out.println(coinname);
		for (Integer k : coinname.keySet()) {
			String s = coinname.get(k);
			System.out.println(s);

		}
	}

	public String getName(int amount) {
		if (coinname.containsKey(amount)) {
			return coinname.get(amount);
		} else {
			return "not find";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		Excise2 excise2 = new Excise2();
		String name = excise2.getName(amount);
		System.out.println(name);
	}

}
