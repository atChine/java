public class Final01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);

        System.out.println(Circle.calArea());
    }
}
class Circle{
    private static double radius;
    private final static double PI=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }
    public static double calArea(){
        return PI*radius*radius;
    }
}