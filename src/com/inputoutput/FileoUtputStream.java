package com.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoUtputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs1 = new FileOutputStream("C:\\Users\\tsshu\\Downloads\\Video\\shubhamop.txt");
        String s = "My First Output Stream";
        String d = "My First Output Stream";

        byte[] b = s.getBytes();
        byte[] c = d.getBytes();

        fs1.write(b);
        fs1.write(c);
        fs1.close();
        System.out.println("Success");

    }
}
