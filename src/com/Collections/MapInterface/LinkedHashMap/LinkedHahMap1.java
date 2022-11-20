package com.Collections.MapInterface.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHahMap1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map =new LinkedHashMap<>();
        map.put(101,"Shubham");
        map.put(102,"Sanju");
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
