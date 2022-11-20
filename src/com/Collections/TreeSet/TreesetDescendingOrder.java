package com.Collections.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDescendingOrder {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(10);

        set.add(4);

        set.add(3);
        set.add(7);

        set.add(5);
        set.add(6);

        set.add(8);
        set.add(9);


        Iterator<Integer> itr =set.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
