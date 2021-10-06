public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager manager = new Manager("小冰冰","12345",6000);
        manager.work();
        CommonEmployee commonEmployee = new CommonEmployee("王冰冰",
                "123456",9000,2000);
        commonEmployee.work();
    }
}
//父类
abstract class Employee{
    private String name;
    private String id;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
//员工类
class Manager extends Employee{
    public Manager(String name, String id, double salary) {
        super(name, id, salary);
    }
    public void work(){
        System.out.println(getName()+"正在工作");
    }
}
//经理类
class CommonEmployee extends Employee{
    private double bonus;
    public CommonEmployee(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work(){
        System.out.println(getName()+"正在工作");
    }
}
