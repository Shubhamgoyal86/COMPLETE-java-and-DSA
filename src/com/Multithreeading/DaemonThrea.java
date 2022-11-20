package com.Multithreeading;

public class DaemonThrea extends  Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread Working");

        }else {
            System.out.println("User Thread Working....");
        }
    }
    public static void main(String[] args) {
        DaemonThrea dT1 = new DaemonThrea();
        DaemonThrea dT2 = new DaemonThrea();
        DaemonThrea dT3 = new DaemonThrea();

        dT1.setDaemon(true);
        dT1.start();
        dT2.start();

        dT3.start();

    }
}
