package com.Multithreeading.ThreadGroup;
class ThreadNew2 extends  Thread{
    ThreadNew2(String tName,ThreadGroup tgrp){
        super(tgrp,tName);
        start();
    }
    public void run(){
        for (int i=0;i<=100;i++){
            try {
                Thread.sleep(5);
            }catch (Exception e){
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+"Thread Has Finished Executing");
    }
}
public class ThreadDestroyedGroup {
    public static void main(String[] args) throws InterruptedException {

        ThreadGroup tg = new ThreadGroup("Parent Class");
        ThreadGroup tg1 = new ThreadGroup(tg,"ChildGroup");
        ThreadNew2 th1 = new ThreadNew2("First",tg);
        System.out.println("Starting the First");
        ThreadNew2 th2 = new ThreadNew2("Second",tg);
        System.out.println("Starting The Secon Group");

        th1.join();
        th2.join();

        tg.destroy();
        System.out.println(tg.getName()+"is destroyed");
    }
}
