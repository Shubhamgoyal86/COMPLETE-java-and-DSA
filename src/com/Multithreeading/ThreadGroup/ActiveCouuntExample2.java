package com.Multithreeading.ThreadGroup;
class ThreadNeew extends  Thread{
    ThreadNeew(String tName,ThreadGroup tgrp){
        super(tgrp,tName);
        start();
    }
    public void run(){
        for (int i=0;i<=100;i++){
            try {
                Thread.sleep(5);
            }catch (InterruptedException e ){
                System.out.println("Exceptions is found"+e);
            }
        }
        System.out.println(Thread.currentThread().getName()+"Finished Exeuting");
    }
}
public class ActiveCouuntExample2 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("PArent Thread");
        ThreadGroup tg1 = new ThreadGroup(tg,"Child Group");
        ThreadNeew th1 = new ThreadNeew("First",tg);

        System.out.println("First  IS Starting");
        ThreadNeew th2 = new ThreadNeew("Second",tg);
        System.out.println("Thread Second iS Starting ");
        System.out.println("Total no. of Active Groups are : "+ tg.activeCount());
    }
}
