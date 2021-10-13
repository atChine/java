package Exercise01;

public class ThreadExercise01 {
    public static void main(String[] args) {
//        MyThread01 t1 = new MyThread01();
//        t1.start();

//        MyThread02 t2 = new MyThread02();
//        t2.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    if (i % 2 == 0) {
                        System.out.println("++++++++++偶数为" + i);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
            }
        }.start();
    }
}

//class MyThread01 extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 10000; i++) {
//            if (i % 2 == 0) {
//                System.out.println("++++++++++偶数为" + i);
//            }
//        }
//    }
//}

//class MyThread02 extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i < 10000; i++) {
//            if (i % 2 != 0) {
//                System.out.println("基数为" + i);
//            }
//        }
//    }
//}
