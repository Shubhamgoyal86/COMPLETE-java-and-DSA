package com.Multithreeading.ThreadGroup;
class Threadnew extends Thread{
    Threadnew (String tName,ThreadGroup tgrp){
        super(tgrp, tName);
        start();
    }
    public  void run(){
        for (int j=0;j<1000;j++){
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException e){
                System.out.println("The exception has announced "+e);
            }
        }
    }
}
public class ActiveCountEample {
    public static void main(String[] args) {
            ThreadGroup tg = new ThreadGroup("Parent group of threads");
            Threadnew th1 = new Threadnew("first",tg);
        System.out.println("Starting of the First");

        Threadnew th2  = new Threadnew("second",tg);
        System.out.println("Starting of the Second");

        System.out.println("The total no. of active Threads are: "+ tg.activeCount());
    }
}
