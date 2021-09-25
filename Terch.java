package Overrid02;

public class Terch extends Person {
	private double salary;

	public Terch(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String say() {
		// TODO Auto-generated method stub
		return super.say() + " salary:" + salary;
	}

	public void teach() {
		System.out.println(getName() + "正在教学。。。。。");
	}

}
