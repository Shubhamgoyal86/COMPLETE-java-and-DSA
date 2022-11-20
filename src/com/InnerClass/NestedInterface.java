package com.InnerClass;
interface College{
    interface Student{
         void show();
    }
}

public class NestedInterface implements College.Student {

    public void show(){
        System.out.println("Shubham Goyal");
    }
    public static void main(String[] args) {
        College.Student cs = new NestedInterface();
        cs.show();

    }
}
