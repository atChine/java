public class Person {
    private String name;
    private Vehicles vehicles;
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void PassRiver(){
        if(!(vehicles instanceof Boat)) {
            //先得到船
            vehicles = VehiclesFactory.getBoat();
        }
            vehicles.work();
    }
    public void common(){
        //得到马
        if(!(vehicles instanceof Horse)){
            vehicles=VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public void Fire(){
        if(!(vehicles instanceof Plan)){
            vehicles=VehiclesFactory.getPlan();
        }
        vehicles.work();
    }
}
