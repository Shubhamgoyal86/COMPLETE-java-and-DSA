package com.Multithreeading.ThreadGroup;

public class GarbageCollecctor1 {
    public void finalize(){
        System.out.println("GArbafge is collected");
    }
    public static void main(String[] args) {
        GarbageCollecctor1 gc1 = new GarbageCollecctor1();
        GarbageCollecctor1 gc2 = new GarbageCollecctor1();
        gc2=null;
        gc1=null;
        System.gc();
    }
}
