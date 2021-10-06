public class interExerse {
    public static void main(String[] args) {

        Callphone callphone = new Callphone();
        callphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪，起床了");
            }
        });
        callphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });
    }
}
interface Bell{  //接口
    void ring();  //方法
}
class Callphone{   //类
    public void alarmclock(Bell bell){   //形参为Bell的接口类型
        bell.ring();
    }
}