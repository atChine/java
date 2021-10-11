package com;
//懒汉式
public class Exercise02 {
    public static void main(String[] args) {
        Order order01=Order.getOrder();
        Order order02=Order.getOrder();
        System.out.println(order01==order02);
    }
}
class Order{
    //1.私有化构造器
    public Order() {
    }

    //2.声明当前类对象，但不初始化
    private static Order order=null;
    //3.声明公共类，返回当前对象的值
    public static Order getOrder(){
        if(order==null){
            order=new Order();
        }
        return order;
    }
}