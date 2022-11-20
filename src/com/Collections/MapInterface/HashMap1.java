package com.Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(101,"Shubham");
        map.put(102,"Sanju");

        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.put(103,"Surya");
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.putIfAbsent(104,"Ankit");

    }
}
