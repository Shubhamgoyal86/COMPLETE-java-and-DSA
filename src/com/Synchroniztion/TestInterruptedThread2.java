package com.Synchroniztion;

public class TestInterruptedThread2 extends Thread {
    public void run(){

            try {
                Thread.sleep(500);
                System.out.println("Task");
            } catch (InterruptedException e) {

                System.out.println("Exception hAndled"+e);
            }
            System.out.println("Thread is Running");

    }

    public static void main(String[] args) {
        TestInterruptedThread2 ts2 = new TestInterruptedThread2();
        ts2.start();
        ts2.interrupt();
    }
}
