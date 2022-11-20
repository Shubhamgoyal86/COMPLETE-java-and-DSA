package com.Multithreeading.ThreadGroup;

public class AnnounymousShutdown {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new Thread() {
                              public void run() {
                                  System.out.println("Shutdown Task Complleted");
                              }

                          });
        System.out.println("Main Threaad Slleping");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e);
        }

    }

}
