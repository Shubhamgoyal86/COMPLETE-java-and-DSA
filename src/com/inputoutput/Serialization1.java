package com.inputoutput;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization1 {
    public static void main(String[] args) throws IOException {
        Student1 s1 = new Student1(456,"Shubham");
        FileOutputStream fs1 = new FileOutputStream("f.txt");
        ObjectOutputStream os1 = new ObjectOutputStream(fs1);
        os1.writeObject(s1);
        os1.flush();
        os1.close();
        System.out.println("success");
    }
}
