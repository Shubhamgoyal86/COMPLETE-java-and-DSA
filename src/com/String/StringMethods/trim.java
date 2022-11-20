package com.String.StringMethods;

public class trim {
    public static void main(String[] args) {
        String str = "     Hello Java Program    ";
        System.out.println(str.length());
        String ts = str.trim();
        System.out.println(ts);
        System.out.println(ts.length());
    }
}
