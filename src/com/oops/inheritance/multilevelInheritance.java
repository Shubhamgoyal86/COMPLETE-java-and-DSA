package com.oops.inheritance;
class Animal1 {
    void eat(){
        System.out.println("eating....");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("barking.....");
    }
}
class BabyDog extends Dog1{
    void weep(){
        System.out.println("weeping......");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.weep();
        bd.bark();
    }
}
