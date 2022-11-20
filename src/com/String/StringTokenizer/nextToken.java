package com.String.StringTokenizer;

import java.util.StringTokenizer;

public class nextToken {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my,name,is,Shubham");
        System.out.println("Next Token IS : "+st.nextToken(","));
        System.out.println("Next Token IS : "+st.nextToken(","));
        System.out.println("Next Token IS : "+st.nextToken(","));

    }
}
