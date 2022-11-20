package com.Multithreeading.ThreadGroup;

import com.Multithreeading.ThreadName;

class THreadNawa extends Thread{
    THreadNawa(String tName,ThreadGroup tgrp){
        super(tgrp,tName);
        start();
    }
    public  void run(){
        for (int i=0;i<=100;i++){
            try {
                Thread.sleep(5);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName()+" thread Has Finished Execution");
    }
}
public class ThreadEnumerate {
    public static void main(String[] args) {

        ThreadGroup tg= new ThreadGroup("Parent Group");
        ThreadGroup tg1 = new ThreadGroup(tg,"Child Group");
        THreadNawa th1 = new THreadNawa("First",tg);
        System.out.println("thread First Started");
        THreadNawa th2 = new THreadNawa("Second",tg);
        System.out.println("thread Second Started");

        Thread[] grp = new Thread[tg.activeCount()];
        int crp = tg.enumerate(grp);
        for (int i=0;i<crp;i++){
            System.out.println("Thread "+grp[i].getName()+" is Found");
        }

    }
}
