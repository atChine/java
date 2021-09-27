import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop=true;
        String key="";
        //明细
        String detaile="-----------零钱通明细----------";
        //收益入账
        double money=0;
        double balance=0;
        //消费
        String notes="";
        Date date=null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //定义变量
        do{
            System.out.println("\n=========零钱通菜单========");
            System.out.println("\t1.零钱通明细：");
            System.out.println("\t2.收益入账");
            System.out.println("\t3.消费");
            System.out.println("\t4.退出");

            System.out.println("请选择(1-4):");
            key= scanner.next();

            switch (key){
                case "1":
                    System.out.println(detaile);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money=scanner.nextDouble();
                    if(money<=0){
                        System.out.println("收益不能少于0");
                        break;
                    }
                    balance=balance+money;
                    date=new Date();//获取当前日期
                    //System.out.println(simpleDateFormat.format(date));
                    detaile+="\n收益入账 +"+money+"\t"+simpleDateFormat.format(date)+
                            "\t余额:"+balance;
                    break;
                case "3":
                    System.out.print("输入消费品牌：");
                    notes=scanner.next();
                    System.out.print("输入消费金额：");
                    money=scanner.nextDouble();
                    balance=balance-money;
                    detaile+="\n"+notes+"\t"+"-"+money+"\t"+simpleDateFormat.format(date)+
                            "\t余额:"+balance;

                    break;
                case "4":
                    String choice="";
                    while(true){
                        System.out.println("退出输入y，返回输入n");
                        choice=scanner.next();
                        if("y".equals(choice) || "n".equals(choice)){
                            break;
                        }
                    }
                    if(choice.equals("y")){
                        loop=false;
                    }
                    break;
                default:
                    System.out.println("菜单选择有问题，请从新选择");
            }
        }while (loop);
        System.out.println("退出了零钱通项目~");
    }
}
