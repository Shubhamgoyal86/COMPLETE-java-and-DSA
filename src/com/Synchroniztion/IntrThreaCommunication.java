package com.Synchroniztion;

class customer{
    int amount= 10000;
    synchronized  void withdraw(int amount){
        System.out.println("Going To Withdraw");
        if (this.amount<amount){
            System.out.println("Balance is Low");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.amount-=amount;
        System.out.println("Withdraw Completed");
    }
    synchronized void deposit(int amount){
        System.out.println("going to deposit");
        this.amount+=amount;
        System.out.println("Deposit Completed");
        notify();
    }

}
public class IntrThreaCommunication {
    public static void main(String[] args) {
        final customer cb =new customer();
        new Thread(){
            public void run(){
                cb.deposit(50000);
            }

        }.start();
        new Thread(){
            public void run(){
                cb.withdraw(60000);
            }
        }.start();
        new Thread(){
            public void run(){
                cb.withdraw(10000);
            }
        }.start();
    }
}
