package com.Synchroniztion;
class Table{
    void printTable(int num) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(num * i);

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Mythread1 extends Thread{
    Table t;
    Mythread1(Table t){
        this.t = t;

    }
    public void run(){
        t.printTable(5);
    }

}

class Mythread2 extends Thread {
    Table t;
    Mythread2(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class WithoutSynchronization {
    public static void main(String[] args) {
        Table tb  =new Table();
        Mythread1 mt1 = new Mythread1(tb);
        Mythread2 mt2 = new Mythread2(tb);
        mt1.start();
        mt2.start();

    }
}
