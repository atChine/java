public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}
class A{
    private final String NAME="王冰冰";
    public void f1(){
        class B{    //局部内部类
            private final String NAME="王bb";
            void show(){
                System.out.println("NAME="+NAME);
                System.out.println("NAME="+A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}