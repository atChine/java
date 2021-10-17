package Exercios;

public class Stringtest {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void chang(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
        String str1="123";
        int i = Integer.parseInt(str1);
        System.out.println(i);
    }
}

class Test {
    public static void main(String[] args) {
        Stringtest ex = new Stringtest();
        ex.chang(ex.str, ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
    }
}
class Tese{
    public void test(){
        String str1="123";
        int i = Integer.parseInt(str1);
        System.out.println(i);
    }
}