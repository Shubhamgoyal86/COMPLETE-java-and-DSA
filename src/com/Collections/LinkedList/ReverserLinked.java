package com.Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverserLinked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Shubham");
        list.add("Sanju");
        list.add("bhavy");
        Iterator itr = list.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
