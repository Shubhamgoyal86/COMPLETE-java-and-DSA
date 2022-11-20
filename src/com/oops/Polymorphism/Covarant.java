package com.oops.Polymorphism;

class A {
    A show(){
        System.out.println("From A");
        return this;
    }
}
class B extends  A{

    B show(){
        System.out.println("From B");
        return this;
    }
}

public class Covarant {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        A a = new A();
        b.show();

    }
}
