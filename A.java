public interface A {
    void say();
    void hi();
    void sleep();
}
class A1 implements A{

    @Override
    public void say() {
        System.out.println("say");
    }

    @Override
    public void hi() {
        System.out.println("hi");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
abstract class A2 implements A{

}
