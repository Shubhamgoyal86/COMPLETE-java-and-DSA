package com.Arrays;

public class copyArray {//Java Program to copy a source array into a destination array in Java

        public static void main(String[] args) {
            //declaring a source array
            char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                    'i', 'n', 'a', 't', 'e', 'd' };
            //declaring a destination array
            char[] copyTo = new char[7];
            //copying array using System.arraycopy() method
            System.arraycopy(copyFrom, 4, copyTo, 0, 7);
            //printing the destination array
            System.out.println(String.valueOf(copyTo));

    }
}
