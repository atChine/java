package Clock;

public class Display {
	private int value = 0;
	private int limit = 0;

	public Display(int limit) {
		this.limit = limit;
	}

	public void increase() {
		value++;
		if (value == limit) {
			value = 0;
		}
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Display display = new Display(24);
		for (;;) {
			display.increase();
			System.out.println(display.getValue());
		}

	}

}
