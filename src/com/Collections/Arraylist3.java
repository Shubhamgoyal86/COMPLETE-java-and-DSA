package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist3 {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<String>();
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Straw Berry");

        Collections.sort(fruit);
        for (String result:fruit){
            System.out.println(result);
        }
        System.out.println("Sorting the NUmbers...........");
        List<Integer> number = new ArrayList<Integer>();
        number.add(54);
        number.add(24);
        number.add(94);
        number.add(44);
        Collections.sort(number);
        for (Integer res:number){
            System.out.println(res);
        }


    }
}
