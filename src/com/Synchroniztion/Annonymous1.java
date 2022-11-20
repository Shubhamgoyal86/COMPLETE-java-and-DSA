package com.Synchroniztion;
class Table2{
    synchronized void PrintTable(int num){
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

public class Annonymous1 {
    public static void main(String[] args) {
       final Table2 obj = new Table2();
       Thread t1 = new Thread(){
           public void run(){
               obj.PrintTable(5);
           }
       };
       Thread t2 = new Thread(){
           public void run(){
               obj.PrintTable(100);
           }
       };
       t1.start();
       t2.start();
    }

}
