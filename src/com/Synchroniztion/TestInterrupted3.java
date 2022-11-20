package com.Synchroniztion;

public class TestInterrupted3 extends Thread {
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestInterrupted3 ts1 = new TestInterrupted3();
        ts1.start();
        ts1.interrupt();
    }
}
