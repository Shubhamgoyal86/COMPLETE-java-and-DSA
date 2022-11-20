package com.String.StringBuffer;

public class StringBuffer_VS_StringBuilder {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Shubham");
        for (int i=0;i<=100000;i++){
            sb.append(" Goyal");
        }
        System.out.println(System.currentTimeMillis()-startTime+"ms");
        startTime = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder("Shubham");
        for (int i=0;i<=100000;i++){
            sb2.append(" Goyal");
        }
        System.out.println(System.currentTimeMillis()-startTime+"ms");
    }
}
