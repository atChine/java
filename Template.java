abstract public class Template {
    public abstract void job();
    public void calculateTime(){
        long start=System.currentTimeMillis();
        job();
        long end=System.currentTimeMillis();
        System.out.println("耗时："+(end-start));
    }
}

class Sub extends Template{
    @Override
    public void job() {
        int sum=0;
        for (int i = 0; i <10000; i++) {
            sum=sum+i;
        }
    }
}

class TestTemplate{
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.calculateTime();
    }
}
