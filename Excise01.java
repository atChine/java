package Exrise;

public class Excise01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("冰冰",10, "记者");
        person[1] = new Person("高举", 21, "学生");
        person[2] = new Person("李华", 5, "学生");

        //输出当前对象
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);//默认掉toStriing的方法
        }
        //冒泡循环
        Person temp=null;
        for (int i = 0; i < person.length-1; i++) {
            for (int j = 0; j < person.length-i-1; j++) {
               if(person[i].getAge() > person[i+1].getAge()) {
                   temp = person[i];
                   person[i] = person[i + 1];
                   person[i + 1] = temp;
               }
            }
        }
        System.out.println(" ");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);//默认掉toStriing的方法
        }
    }
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}