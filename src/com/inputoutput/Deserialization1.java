package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("f.txt"));
        Student1 s = (Student1)os1.readObject();
        System.out.println(s.num+" "+s.Name);
        os1.close();
    }
}
