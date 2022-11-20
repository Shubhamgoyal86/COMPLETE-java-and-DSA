package com.Multithreeading;

public class PriorityThread extends Thread {
    public void run(){
        System.out.println("Running.....");
    }
    public static void main(String[] args) {
        PriorityThread pt1 = new PriorityThread();
        PriorityThread pt2 = new PriorityThread();

        System.out.println(pt1.getPriority());
        System.out.println(pt2.getPriority());
        pt1.setPriority(10);
        System.out.println(pt1.getPriority());
        System.out.println(Thread.currentThread().getPriority());

    }
}
