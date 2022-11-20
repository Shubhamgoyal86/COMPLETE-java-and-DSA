package com.Programs;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check =sc.nextInt();
        int count =0;
        for (int i=1;i<=check;i++){
            if (check%i==0){
                count++;
            }}
            if (count==2){
                System.out.println("Prime Number");
            }
            else {
                System.out.println("Not A prime Number");
            }

    }
}
