package com.Collections;

import java.io.*;
import java.util.ArrayList;

public class ArraylistSerialixation {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Shubham");
        name.add("Surya");
        name.add("Ankit");
        FileOutputStream fs1 = new FileOutputStream("File");
        ObjectOutputStream os2 =new ObjectOutputStream(fs1);
        os2.writeObject(name);
        os2.flush();
        os2.close();

        //Desiraliazation

        FileInputStream fis = new FileInputStream("File");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList list = (ArrayList)ois.readObject();
        System.out.println(list);


    }
}
