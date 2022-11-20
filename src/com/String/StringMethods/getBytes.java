package com.String.StringMethods;

public class getBytes {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        byte[] bt = str.getBytes();
        for (int i=0;i<bt.length;i++){
            System.out.println(bt[i]);
        }
    }
}
