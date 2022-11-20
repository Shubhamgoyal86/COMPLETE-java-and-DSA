package com.Programs;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random dice = new Random();
        for (int i=1;i<=10;i++){
            int number = 1+dice.nextInt(6);
            System.out.println(number);
        }
    }
}
