public class EnumExercise {
    public static void main(String[] args) {
        for (Week value : Week.values()) {
            System.out.println(value);
        }
    }
}
enum Week{
    MONDAY("周一"),SUNDAY("周六");
    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

