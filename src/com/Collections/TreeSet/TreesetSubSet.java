package com.Collections.TreeSet;

import java.util.TreeSet;

public class TreesetSubSet {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("E");
        set.add("B");
        set.add("A");
        set.add("D");
        set.add("C");
        System.out.println("initial set :"+set);
        System.out.println("Head Set : "+set.headSet("D",true) );
        System.out.println("Sub Set : "+set.subSet("B","D") );
        System.out.println("Tail set :"+set.tailSet("C",true));
    }
}
