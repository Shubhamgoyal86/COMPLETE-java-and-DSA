package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStream1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fs1 = new FileInputStream("C:\\Users\\tsshu\\Downloads\\Video\\tsshubhamop.txt");
        FileInputStream fs2 = new FileInputStream("C:\\Users\\tsshu\\Downloads\\Video\\shubhamop.txt");
        SequenceInputStream sc1 = new SequenceInputStream(fs1,fs2);
        int i;
        while ((i=sc1.read())!=-1){
            System.out.print((char)i);


        }
        sc1.close();
        fs1.close();
        fs2.close();
    }
}
