//饿汉
public class SingleTon01 {
    public static void main(String[] args) {
//        Cat instance = Cat.getInstance();
//        System.out.println(instance);
        System.out.println(Cat.n1);
    }
}
//1.将构造器私有化
//2.在类的内部直接创造对象
//3.提供一个公共的static方法，返回cat对象
class Cat{
    private static Cat cat=new Cat("蛋仔");
    private String name;
    public static int n1=2;

    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Cat getInstance(){
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}