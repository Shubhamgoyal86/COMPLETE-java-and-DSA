package com.Synchroniztion;


public class TestInterruptingThread extends Thread {

    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Thread Interrupted"+e);
        }
    }
    public static void main(String[] args) {
        TestInterruptingThread ts1 = new TestInterruptingThread();
        ts1.start();
        ts1.interrupt();
    }
}
