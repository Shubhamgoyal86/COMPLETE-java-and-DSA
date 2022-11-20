package com.Multithreeading;

public class Threadsleep2
{
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e ){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
