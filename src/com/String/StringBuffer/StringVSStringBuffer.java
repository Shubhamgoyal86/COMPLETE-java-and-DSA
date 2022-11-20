package com.String.StringBuffer;

public class StringVSStringBuffer {
    public static String concaatWithString(){
        String t = "Shubham";
        for (int i=0;i<=10000;i++){
            t=t+" Goyal";
        }
        return t;
    }
    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Shubham");
        for (int i=0;i<=10000;i++){
            sb.append(" Goyal");

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long StartTime =System.currentTimeMillis();
        concaatWithString();
        System.out.println("time taken By String: "+(System.currentTimeMillis()-StartTime)+"ms");
        StartTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time Taken By StringBuffer: "+(System.currentTimeMillis()-StartTime)+"ms");
    }
}
