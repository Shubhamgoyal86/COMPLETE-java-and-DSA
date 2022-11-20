package com.Arrays;

public class CloneArray
{
    public static void main(String[] args) {
        int arr[] = {3,4,5,9};
        System.out.println("Original Array");
        for (int i : arr){
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Duplicate array");


        int []carr = arr.clone();
        for (int j:carr){
            System.out.print(j);
        }
        System.out.println();
        System.out.println(arr==carr);

    }

}
