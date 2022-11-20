package com.Collections;

import java.util.ArrayList;

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("mango");
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        for (String Fruits:list){
            System.out.println(Fruits);
        }
    }
}
