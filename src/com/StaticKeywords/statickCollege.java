package com.StaticKeywords;

public class statickCollege {

    int rollno;
    String name;
    static String College= "JNVU";
    statickCollege(int r,String n){
        rollno = r;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+College);
    }
    public static void main(String[] args) {
        statickCollege sc = new statickCollege(25,"shubham");
        statickCollege sc1 = new statickCollege(26,"sanjay");
        sc.display();
        sc1.display();
    }
}
