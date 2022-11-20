package com.Regex;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSpacecharacters {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\S ");
        Matcher m = p.matcher("Shubham Goyal");
        while (m.find()){
            System.out.println(m.start()+"..."+m.end());
        }
    }
}
