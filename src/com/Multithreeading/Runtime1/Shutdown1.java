package com.Multithreeading.Runtime1;

import java.io.IOException;

public class Shutdown1 {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("shutdown -s -t 0");
    }
}
