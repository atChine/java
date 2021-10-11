package com;
/*
单例设计模式，就是在某个系统中，对某个类只有一个实例化对象
 */

//饿汉式
public class Exercise01 {
    public static void main(String[] args) {
        Bank bank01=Bank.getBank();
        Bank bank02=Bank.getBank();
        System.out.println(bank01==bank02);
    }
}
class Bank{
    private String name;

    //1.私有化构造器
    private Bank(String name) {
        this.name = name;
    }

    //2.在内部创建类对象
    private static Bank bank=new Bank("王冰冰");

    //3.提供公共的静态方法去调用这个唯一的类对象
    public static Bank getBank(){
        return bank;
    }
}