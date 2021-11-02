package Exercise;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class ReflectionTest {

    @Test
    public void test02(){
        for (int i = 0; i < 20; i++) {
            int num = new Random().nextInt(3);
            String classPath="";
            switch (num){
                case 0:
                    classPath="java.lang.String";
                    break;
                case 1:
                    classPath="java.util.Date";
                    break;
                case 2:
                    classPath="Exercise.test01";
                    break;

            }
            try {
                Object obj = getInstance(classPath);
                System.out.println(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public Object getInstance(String classPath) throws Exception {
        Class<?> clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
}
