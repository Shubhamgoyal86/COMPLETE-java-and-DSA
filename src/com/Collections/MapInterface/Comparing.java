package com.Collections.MapInterface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Comparing { public static void main(String args[]){
    Map<Integer,String> map= new HashMap<Integer,String>();
    map.put(102,"Rahul");

    map.put(100,"Amit");
    map.put(101,"Vijay");

    map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .forEach(System.out::println);
}
}

