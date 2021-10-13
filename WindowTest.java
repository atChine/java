package Exercise;

public class WindowTest {
    public static void main(String[] args) {
        MyThread01 t1 = new MyThread01();
        MyThread01 t2 = new MyThread01();
        MyThread01 t3 = new MyThread01();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread01 extends Thread{
    private static int ticket=100;
    @Override
    public void run() {
        while (true){
            if(ticket>0){
                System.out.println(getName()+"卖出票号为 "+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}