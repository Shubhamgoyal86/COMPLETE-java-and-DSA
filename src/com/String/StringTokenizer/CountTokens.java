package com.String.StringTokenizer;

import java.util.StringTokenizer;

public class CountTokens {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Hello My Names Is Shubham");
        System.out.println("Total Tokens Is: "+st.countTokens());
    }
}
