package Exercise;

public class productTest {
    public static void main(String[] args) {
        Clerk c1 = new Clerk();
        Product p1 = new Product(c1);
        Customer customer = new Customer(c1);

        p1.setName("工厂");
        customer.setName("王冰冰");

        p1.start();
        customer.start();

    }
}

class Clerk {//店员
    private int num = 0;
    //生产商品
    public synchronized void ProductCount() {
        if(num<20){
            num++;
            System.out.println(Thread.currentThread().getName()+"正在生产"+num+"个商品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //消费商品
    public synchronized void CustomerCount() {
        if(num>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"正在消费"+num+"个商品");
            num--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Product extends Thread {//工厂
    private Clerk clerk;

    public Product(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + ":正在生产");
        while (true) {
            clerk.ProductCount();
        }
    }
}

class Customer extends Thread {//消费者
    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + ":正在消费");
        while (true){
            clerk.CustomerCount();
        }
    }
}