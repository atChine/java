public class HomeWork07 {
    public static void main(String[] args) {
        Car car = new Car(-2);
        car.getAir().flow();
    }
}
class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("吹冷气");
            }
            else if (temperature < 0) {
                System.out.println("吹暖气");
            } else{
                System.out.println("吹风停止工作");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }
}
