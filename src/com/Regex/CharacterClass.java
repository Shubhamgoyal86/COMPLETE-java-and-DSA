package com.Regex;

import java.util.regex.Pattern;

public class CharacterClass {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[abc]","aa"));
        System.out.println(Pattern.matches("[^abc]","df"));
        System.out.println(Pattern.matches("[a-zA-Z]","D"));
        System.out.println(Pattern.matches("[a-z&&[def]]","e"));
        System.out.println(Pattern.matches("[a-z&&[^bc]]","a"));
        System.out.println(Pattern.matches("[a-z&&[^bc]]","b"));


    }
}
