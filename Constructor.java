
public class Constructor {

	public static void main(String[] args) {
		
		Preson p1=new Preson();
		System.out.println("p1 "+p1.age+" "+p1.name);
		Preson p2=new Preson("Íõ±ù±ù", 29);
		System.out.println("p2 "+p2.age+" "+p2.name);
		
	}
}


class Dog{
	
	public Dog(String dname) {
		
	}
	
	public  Dog() {
		
	}
}

class Preson{
	String name;
	int age;
	
	Preson() {
		this.age=18;
		this.name="Ð¡Íõ";
	}
	
	
	Preson(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}