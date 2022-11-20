package com.oops.Abstract;

public class Phone {
    public static void main(String[] args) {
        Details dp = new iphone();
        dp.showConfig();


    }
}
abstract class Details{
    abstract void showConfig();
}
class iphone extends Details{
    void showConfig() {
        System.out.println("16gb ram, 256gb storage");

    }
}

class realme extends Details{
    void showConfig() {
        System.out.println("3gb ram, 32gb storage");

    }
}