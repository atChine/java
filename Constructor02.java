import java.security.Permissions;

public class Constructor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person("����", 29);
		Person p2=new Person("��",31);
		
		System.out.println("p1��p2�ȽϵĽ��="+p1.compareTo(p2));

	}

}

	class Person{
		String name;
		int age;
		
		public Person(String name,int age) {  //������
			this.name=name;
			this.age=age;
		}
		
		public boolean compareTo(Person p) {
			System.out.println(this.name);
			System.out.println(p.name);
			return this.name.equals(p.name) && this.age==p.age;
		}
	}
	
	