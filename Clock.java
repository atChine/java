package Clock;

class Clock {

	private Display hour = new Display(24);
	private Display minue = new Display(60);

	private void state() {
		while (true) {
			minue.increase();
			if (minue.getValue() == 0) {
				hour.increase();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(), minue.getValue());
		}
	}

	public static void main(String[] args) {
		Clock clock = new Clock();
		clock.state();
	}

}
