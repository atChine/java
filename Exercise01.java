import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String pare = "545454545.32";
        StringBuffer sb = new StringBuffer(pare);

        for (int i = sb.lastIndexOf(".") -3; i > 0; i = i - 3) {
            sb = sb.insert(i , ",");
        }
        System.out.println(sb);
    }
}
