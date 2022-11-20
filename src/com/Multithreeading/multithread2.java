package com.Multithreeading;

public class multithread2 {
    public static void main(String[] args) {
        Thread t1 = new Thread("My name is Shubham");
        t1.start();
        String str = t1.getName();
        System.out.println(str);
    }
}
