package com.inputoutput;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStrewam1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs1 = new FileOutputStream("C:\\Users\\tsshu\\Downloads\\Video\\tsshubhamop.txt");
        BufferedOutputStream bs1 = new BufferedOutputStream(fs1);
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        bs1.write(b);
        bs1.flush();
        bs1.close();
        fs1.close();
        System.out.println("success");
    }
}
