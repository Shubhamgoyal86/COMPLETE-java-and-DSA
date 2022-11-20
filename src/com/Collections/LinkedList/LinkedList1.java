package com.Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String > name = new LinkedList<>() ;
        name.add("Shubham goyal");
        name.add(1,"Chinu");
        name.add("Bhavy");


        LinkedList<String > name2 = new LinkedList<>() ;
        name2.add("Surya");
        name2.add("Ankit");
        name.addAll(name2);
        Iterator<String> itr = name.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
