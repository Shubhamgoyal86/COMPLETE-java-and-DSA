package com.Regex;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        Pattern p = Pattern.compile("(0|91)?[6789][0-9]{9}");
        Matcher m = p.matcher(num);
       if (m.find()&&m.group().equals(num)){
           System.out.println("Valid Mobile Number");
       }
       else {
           System.out.println("Not a valid Mobile Number");
       }
    }
}
