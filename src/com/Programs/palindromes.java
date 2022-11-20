package com.Programs;

import java.util.Scanner;

public class palindromes {
    public static void main(String[] args) {
        int reverse=0,reminder,contain,number;

        Scanner sc =new Scanner(System.in);//121
         number = sc.nextInt();//121
         //121
        while (number>0){
             reminder = number%10;//1
             reverse= reverse*10+reminder;//0*10+1=> 1
             number=number/10;// 121/10=> 12
        }
        if (number==reverse){
            System.out.println("Palindrome Sequence");
        }
        else {
            System.out.println("Not A Palindrome");
        }
    }
}
