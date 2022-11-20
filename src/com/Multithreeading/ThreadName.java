package com.Multithreeading;

public class ThreadName extends  Thread {
    public  void run(){
        System.out.println("running.....");
    }
    public static void main(String[] args) {
        ThreadName t1 = new ThreadName();
        ThreadName t2 = new ThreadName();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.start();
        t2.start();


        t1.setName("Shubham Goyal");
        System.out.println("After changing name of t1:"+t1.getName());
    }
}
