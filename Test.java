package Exercise04;

import Except03.Stduent;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("王冰冰", "女", 31, "200011");
        student.printInof();
        System.out.println("------------------");
        Person[] people = new Person[4];
        people[0] = new Student("王冰冰", "女", 31, "200011");
        people[1] = new Student("王冰冰", "女", 35, "200011");
        people[2] = new Teacher("王冰冰", "女", 22, 25);
        people[3] = new Teacher("王冰冰", "女", 88, 3);

        Test test = new Test();
        test.bubbleSort(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].toString());
            test.tt(people[i]);
        }
    }

    public void tt(Person p){
        if(p instanceof Student){
            ((Student)p).study();
        }else if(p instanceof Teacher){
            ((Teacher)p).teach();
        }else {
            System.out.println("NO");
        }
    }

    public void bubbleSort(Person[] people) {
        Person temp=null;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() < people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
        }

    }
}