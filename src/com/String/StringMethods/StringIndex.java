package com.String.StringMethods;

public class StringIndex {
    public static void main(String[] args) {
        String str = "This is index Of Example";
        int index1 = str.indexOf("is");
        int index2 = str.indexOf("index");

        int index3 = str.indexOf("is",4);
        System.out.println(index3);
    }
}
