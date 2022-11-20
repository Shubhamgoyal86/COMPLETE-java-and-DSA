package com.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ListToArrays {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Shubham");
        name.add("Sanju");
        name.add("Bhavy");
        System.out.println(name);
        String[] array = name.toArray(new String[name.size()]);

    }
}
