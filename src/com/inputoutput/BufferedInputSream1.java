package com.inputoutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputSream1 {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream fs1 = new FileInputStream("C:\\Users\\tsshu\\Downloads\\Video\\tsshubhamop.txt");
            BufferedInputStream bs1 = new BufferedInputStream(fs1);
            int i;
            while ((i=bs1.read())!=-1){
                System.out.print((char)i);

            }
            bs1.close();
            fs1.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
