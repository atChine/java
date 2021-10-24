package Exercise;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args){
        Employee e1 = new Employee("wangbingbing",31,new MyDate(1982,4,23));
        Employee e2 = new Employee("liudehua",55,new MyDate(1962,3,23));
        Employee e3 = new Employee("zhangxuewyu",54,new MyDate(1963,4,23));
        Employee e4 = new Employee("liming",60,new MyDate(1950,4,23));
        Employee e5 = new Employee("maozed",88,new MyDate(1934,8,23));
        Employee e6 = new Employee("tang",88,new MyDate(1934,8,20));

        TreeSet<Employee> set = new TreeSet<Employee>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
