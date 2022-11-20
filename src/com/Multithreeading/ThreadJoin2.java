package com.Multithreeading;

public class ThreadJoin2  extends  Thread{
    public  void run(){
        for (int i=1;i<=3;i++){
            try {
                Thread.sleep(300);
            }catch (Exception e ){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ThreadJoin2 t1 = new ThreadJoin2();
        ThreadJoin2 t2 = new ThreadJoin2();
        ThreadJoin2 t3 = new ThreadJoin2();

        t1.start();
        try {
            t1.join();
        }catch (Exception e ){
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
}
