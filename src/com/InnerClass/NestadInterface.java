package com.InnerClass;
interface college{
    void id();
    interface Student{
        void name();
    }
}

public class NestadInterface implements college.Student {
    public void name(){
        System.out.println("Shubham Goyal");
    }
    public static void main(String[] args) {
        college.Student cs = new NestadInterface();
        cs.name();
    }
}
