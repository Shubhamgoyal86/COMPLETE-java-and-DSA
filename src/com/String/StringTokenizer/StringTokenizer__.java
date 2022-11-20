package com.String.StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer__ {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Shubham Goyal");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
