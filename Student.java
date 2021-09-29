package Exercise04;

public class Student extends Person{
    private String stu_id;

    public Student(String name, String sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我会好好学习");
    }

    @Override
    public String play() {
        return super.play()+"足球";
    }
    public void printInof(){
        System.out.println("学生基本信息");
        System.out.println(baseInof());
        System.out.println("学号："+stu_id);
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}'+super.toString();
    }
}
