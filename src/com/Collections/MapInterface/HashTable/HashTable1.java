package com.Collections.MapInterface.HashTable;

import java.util.Hashtable;

public class HashTable1

{
    public static void main(String[] args) {
        Hashtable<Integer,String> map = new Hashtable<>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        map.putIfAbsent(101,"Sanju");
        System.out.println(map);
    }
}
