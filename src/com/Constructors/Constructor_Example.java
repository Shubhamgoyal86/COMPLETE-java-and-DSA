package com.Constructors;

public class Constructor_Example {
    int id;
    String name;
    public  Constructor_Example(int i,String s){
        id= i;
        name= s;
    }
    void  display(){
        System.out.println(id+" "+ name);
    }
    public static void main(String[] args) {
        Constructor_Example ce = new Constructor_Example(25,"Shubham");
        Constructor_Example ce2 = new Constructor_Example(26,"sanjnay");
        ce.display();
        ce2.display();
    }
}
