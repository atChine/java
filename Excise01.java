package Exrise;

public class Excise01 {
    Person person=new Person();
//    Person person01=new Person("王冰冰",20,"记者");
//    Person person02= new Person("高举",18,"学生");
//    Person person03=new Person("李华",22,"学生");

    Person[] person01=new Person[3];
    Person[1]=new Person01 ("王冰冰",20,"记者");
}
class Person{
    String name;
    int age;
    String job;

    Person(){

    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}