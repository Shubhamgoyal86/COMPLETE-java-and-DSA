package com.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Shubham");
        list.add("Surya");
        list.add("Ankit");
        list.add("Sanju");
        ListIterator<String> ls1 = list.listIterator(list.size());
        while (ls1.hasPrevious()){
            String str = ls1.previous();
            System.out.println(str);

        }
        list.forEach(a->{
            System.out.println(a);
        });

    }
}
