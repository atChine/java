public class SingleTon02 {
    public static void main(String[] args) {
//        Girlfind instance = Girlfind.getInstance();
//        System.out.println(instance);
        System.out.println(Girlfind.n1);
    }
}
class Girlfind{
    private String name;
    public static int n1=1000;
    private static Girlfind gf;
    private Girlfind(String name) {
        System.out.println("gzq调用");
        this.name = name;
    }
    public static Girlfind getInstance(){
        if(gf==null)
        {
        gf=new Girlfind("王冰冰");
        }
        return gf;
    }

    @Override
    public String toString() {
        return "Girlfind{" +
                "name='" + name + '\'' +
                '}';
    }
}