package Exercise;

import javax.swing.*;
import java.util.concurrent.locks.ReentrantLock;

public class Communicatiion {
    public static void main(String[] args) {
        A a = new A();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);

        t1.setName("线程一");
        t2.setName("-------线程二-----");

        t1.start();
        t2.start();

    }
}

class A implements Runnable {
    private int num = 1;
    private ReentrantLock lock = new ReentrantLock(true);
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName() + num);
                    num++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}