package com.Collections.TreeSet;

import java.util.TreeSet;

public class highestAndLowest {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(64);
        set.add(12);
        set.add(45);
        set.add(78);
        System.out.println("lowest value is: "+set.pollFirst());
        System.out.println("Highest  value is: "+set.pollLast());
    }
}
