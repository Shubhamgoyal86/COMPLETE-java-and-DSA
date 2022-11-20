package com.String;
import  java.util.*;

import com.Arrays.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String text= new String("Hello, My name is Sachin");
        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split("\\.");

    }
}
