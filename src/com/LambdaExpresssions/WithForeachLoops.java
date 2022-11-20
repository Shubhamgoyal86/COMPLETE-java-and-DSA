package com.LambdaExpresssions;

import java.util.ArrayList;
import java.util.List;

public class WithForeachLoops {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Shubham Goyal");
        ls.add("Ganesh Goyal");
        ls.add("Chintu Goyal");
        ls.add("Sharda Goyal");

        ls.forEach(
                (n)-> System.out.println(n)

        );

    }
}
