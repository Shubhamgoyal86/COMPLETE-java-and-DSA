package com.Collections.Set.Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
