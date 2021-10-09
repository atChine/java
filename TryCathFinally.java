public class TryCathFinally {
    public static void main(String[] args) {

        try {
            String name="王冰冰";
            int a=Integer.parseInt(name);
            System.out.println("数字="+a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息="+e.getMessage());
        }
    }
}
