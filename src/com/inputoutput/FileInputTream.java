package com.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTream {
    public static void main(String[] args) throws IOException {
         try {
             FileInputStream fs1    = new FileInputStream("C:\\Users\\tsshu\\Downloads\\Video\\shubhamop.txt");
             int i=0;
             while ((i=fs1.read())!=-1){
                 System.out.print((char)i );
             }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
