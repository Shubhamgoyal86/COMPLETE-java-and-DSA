package com.Multithreeading.ThreadGroup;

public class ShutdownHook extends  Thread {
    public void run(){
        System.out.println("Shutdown Hook Working");
    }
    public static void main(String[] args) throws InterruptedException {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new ShutdownHook());
        System.out.println("Main Proceess is end");
        Thread.sleep(10000);
    }
}
