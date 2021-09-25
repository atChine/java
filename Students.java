package Overrid02;

public class Students extends Person {

	private double socer;

	public Students(String name, int age, double socer) {
		super(name, age);
		this.socer = socer;
	}

	public double getSocer() {
		return socer;
	}

	public void setSocer(double socer) {
		this.socer = socer;
	}

	@Override
	public String say() {
		return super.say() + " socer:" + socer;
	}

	public void study() {
		System.out.println(getName() + "ÕýÔÚÑ§java¡£¡£¡£¡£¡£");
	}

}
