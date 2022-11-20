package com.Collections.Set.Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset2 {
    public static void main(String[] args) {
        ArrayList<String > atr = new ArrayList<>();
        atr.add("Shubham");
        HashSet<String> set =new HashSet<>(atr);
        set.add("Sanju");
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
