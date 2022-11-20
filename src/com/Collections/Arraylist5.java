package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student1{
    String name;
    int age;
    int rollno;
    Student1(String name,int age,int rollno){
        this.age=age;
        this.name=name;
        this.rollno=rollno;
    }
}

public class Arraylist5 {
    public static void main(String[] args) {
        Student1 s1 =new Student1("Shubham",19,34);
        Student1 s2 =new Student1("Surya",22,36);
        Student1 s3 =new Student1("Ankit",20,39);
        ArrayList<Student1> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        Iterator itr = al.iterator();
        while (itr.hasNext()){
            Student1 op = (Student1)itr.next();
            System.out.println(op.rollno+" "+ op.age+" "+op.name);

        }


    }
}
