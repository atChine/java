package Exercise;

import org.junit.Test;

import java.util.*;

public class CollectionTest {
    @Test
    public void test01() {
        ArrayList list = new ArrayList();
        list.add(new Person("wangbb", 32));
        list.add(new Person("sili", 90));
        list.add(new Person("dsd", 66));
        list.add(new Person("vf", 11));
        System.out.println(list.stream().max(Comparator.comparing(Person::getAge)).get());
    }

    @Test
    public void test02() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Tom", 88);
        map.put("Aack", 22);
        map.put("Bi", 223);
        map.put("Cerry", 60);

        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer Value = next.getValue();
            System.out.println(key+"------"+Value);
        }

    }

}
