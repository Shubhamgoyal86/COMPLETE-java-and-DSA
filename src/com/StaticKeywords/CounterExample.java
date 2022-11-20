package com.StaticKeywords;

public class CounterExample {
    static int count =0;
    int bound =0;
    CounterExample(){
        count++;
        bound++;
        System.out.println(count+" "+bound);
    }


    public static void main(String[] args) {
        CounterExample ce = new CounterExample();
        CounterExample ce1 = new CounterExample();
        CounterExample ce2= new CounterExample();

    }
}
