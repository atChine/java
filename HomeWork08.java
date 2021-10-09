public class HomeWork08 {
    public static void main(String[] args) {
        Color blue = Color.BLUE;
        blue.show();
        switch (blue){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("黑色");
                break;
            default:
                System.out.println("没有匹配到");
        }
    }
}
interface Imycolor{
    public void show();
}

enum Color implements Imycolor{
    RED(250,0,0),BLUE( 0,0,244);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性"+redValue+greenValue+blueValue);
    }
}
