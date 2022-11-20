package com.Collections.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQuese {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Jai");

        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Rahul");
        System.out.println("head: "+queue.peek());
        System.out.println("head: "+queue.element());
        System.out.println("Iterating the elements");
        Iterator itr = queue.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");

        }
        System.out.println(" ");
        queue.remove();
        queue.poll();
        Iterator itr2 = queue.iterator();
        while (itr2.hasNext()){
            System.out.print(itr2.next()+" ");

        }


    }
}
