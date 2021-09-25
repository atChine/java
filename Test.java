package Overrid02;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] person = new Person[5];
		person[0] = new Person("Jake", 35);
		person[1] = new Students("jake", 19, 100);
		person[2] = new Students("Tom", 18, 100);
		person[3] = new Terch("smith", 35, 20000);
		person[4] = new Terch("Feni", 40, 25000);

		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i].say());
			if (person[i] instanceof Students) {
				((Students) person[i]).study();
			} else if (person[i] instanceof Terch) {
				((Terch) person[i]).teach();
			}
		}

	}
}