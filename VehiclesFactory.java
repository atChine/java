public class VehiclesFactory {
    private static Horse horse=new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Plan getPlan(){
        return new Plan();
    }
}
