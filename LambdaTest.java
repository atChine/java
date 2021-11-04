package Exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest {
    @Test
    public void test(){
        List<String> list = Arrays.asList("北京", "上海", "南京", "东京");
        ArrayList<String> filters = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filters);
    }
    public ArrayList<String> filterString(List<String> list, Predicate<String> pred){
        ArrayList<String> filterList= new ArrayList<>();
        for (String s: list){
            if(pred.test(s)){
                filterList.add(s);
            }
        }
        System.out.println(filterList);
        return filterList;
    }
}
