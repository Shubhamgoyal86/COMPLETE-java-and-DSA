package com.Synchroniztion;

class Table1 {
    synchronized void PrintTable(int num) {
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
    class Myread1 extends  Thread{
        Table1 t;
        Myread1(Table1 t){
            this.t = t;
        }
        public void run(){
            t.PrintTable(5);
        }
    }
    class Myread2 extends  Thread{
        Table1 t;
        Myread2(Table1 t ){
            this.t = t;
        }
        public void run(){
            t.PrintTable(100);
        }
    }


public class WithSynchronization {
    public static void main(String[] args) {
        Table1 tb1 = new Table1();
        Myread1 mb1 = new Myread1(tb1);
        Myread2 mb2 = new Myread2(tb1);
        mb1.run();
        mb2.run();

    }
}
