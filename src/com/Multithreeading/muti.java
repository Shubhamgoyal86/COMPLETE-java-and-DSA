package com.Multithreeading;

public class muti implements Runnable{
    public void run(){
        System.out.println("Thread.....");
    }

    public static void main(String[] args) {
        muti m1 = new muti();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
