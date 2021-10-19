package Exercise;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise01 {
    @Test
    public void test() {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());
        System.out.println(str);
    }

    @Test
    public void test01() throws ParseException {
        //实例化
        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf02 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf02.format(date));
        //解析
        System.out.println(sdf02.parse("2021-05-20 11:26:20"));

    }

    @Test
    public void testspl() throws ParseException {
        String birth = "2000-11-30";
        SimpleDateFormat sdf03 = new SimpleDateFormat("yyyy-MM-dd");

        //System.out.println(sdf03.parse(birth));
        Date date = sdf03.parse(birth);
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);
    }
}
