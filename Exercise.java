package Exercise02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise {
    @Test
    public void test() {
        List<?> list = null;

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("255");
        list1.add("f");
        list1.add("s");
        list1.add("s");
        list=list1;

        System.out.println(list.get(0));

    }
    public void print( List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
