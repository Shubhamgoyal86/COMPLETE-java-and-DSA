package com.Multithreeading;

public class Multithread1 extends  Thread {
    public void run(){
        System.out.println("Thread......");
    }

    public static void main(String[] args) {
        Multithread1 m1 = new Multithread1();
        m1.start();
    }
}
