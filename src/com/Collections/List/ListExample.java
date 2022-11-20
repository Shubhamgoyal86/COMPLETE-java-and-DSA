package com.Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        String[] array ={"Shubham","Sanju"};
        System.out.println("printing arrays "+Arrays.toString(array));
        List<String> list = new ArrayList<>();
        for (String op:array){
            list.add(op);

        }
        System.out.println("printing list: "+list);
    }
}
