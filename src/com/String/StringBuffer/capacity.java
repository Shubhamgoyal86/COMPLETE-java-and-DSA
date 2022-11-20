package com.String.StringBuffer;

public class capacity {
    public static void main(String[] args) {
        StringBuffer as = new StringBuffer();
        System.out.println(as.capacity());
        as.append("Shubham");
        System.out.println(as.capacity());
        as.append(" Goyal is the Best");
        System.out.println(as.capacity());
    }
}
