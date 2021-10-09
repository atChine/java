public class Exercise {
    public static void main(String[] args) {
        int n = 1;
        Integer integer = new Integer(n);
        System.out.println(integer);

        Integer integer1 = new Integer(50);
        int i1 = integer1.intValue();

        int a = 10;
        String a1 = Integer.toString(a);
        System.out.println(a1);

        String b = "123";
        int b1 = Integer.parseInt(b);
        System.out.println(b1);
    }
}
