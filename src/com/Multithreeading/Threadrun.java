package com.Multithreeading;

public class Threadrun extends Thread {
    public void run(){
        for (int i =1;i<=5;i++){
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Threadrun t1 = new Threadrun();
        Threadrun t2 = new Threadrun();
        t1.run();
        t2.run();

    }
}
