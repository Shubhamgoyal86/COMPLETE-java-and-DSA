package com.Collections.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class mapinterfaacenew {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(36,"Shubham");
        map.put(38,"Surya");
        map.put(04,"Ankit");
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
