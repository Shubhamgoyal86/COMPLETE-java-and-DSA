package com.Synchroniztion;
class Table5{
    synchronized  static  void PrintTable(int num){
        for (int i=1;i<=5;i++){
            System.out.println(num*i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Mythread6 extends Thread{


    public void run(){
        Table5.PrintTable(5);
    }
}
class Mythread7 extends Thread{


    public void run(){
        Table5.PrintTable(100);
    }
}
class Mythread8 extends Thread{


    public void run(){
        Table5.PrintTable(500);
    }
}
public class Static_Synchronization {
    public static void main(String[] args) {

        Table5 tb= new Table5();
        Mythread6 m6 = new Mythread6();
        Mythread7 m7 = new Mythread7();
        Mythread8 m8 = new Mythread8();
        m6.start();
        m7.start();
        m8.start();
    }
}
