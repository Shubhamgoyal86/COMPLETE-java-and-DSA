package com.Multithreeading.JavaThreadPoool;

public class WorkerThread implements  Runnable{
    private String message;
    public  WorkerThread(String s ){
        this.message= s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"Start(message)="+message);
        processmanager();
        System.out.println(Thread.currentThread().getName()+"(END)");
    }
    private void processmanager(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

