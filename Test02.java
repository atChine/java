package Exercise;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test02 {
    public static void main(String[] args){
        Employee e1 = new Employee("wangbingbing",31,new MyDate(1982,4,23));
        Employee e2 = new Employee("liudehua",55,new MyDate(1962,3,23));
        Employee e3 = new Employee("zhangxuewyu",54,new MyDate(1963,4,23));
        Employee e4 = new Employee("liming",60,new MyDate(1950,4,23));
        Employee e5 = new Employee("maozed",88,new MyDate(1934,8,23));
        Employee e6 = new Employee("tang",88,new MyDate(1934,8,20));

        TreeSet<Employee> set = new TreeSet<Employee>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();

                    int numYear = b1.getYear() - b2.getYear();
                    if (numYear != 0) {
                        return numYear;
                    }

                    int numMonth = b1.getMonth() - b2.getMonth();
                    if (numMonth != 0) {
                        return numMonth;
                    }

                    return b1.getDay() - b2.getDay();

                }
                throw new RuntimeException("传入数据不一致");
            }
        });
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
