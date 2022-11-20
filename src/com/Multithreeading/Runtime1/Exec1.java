package com.Multithreeading.Runtime1;

import java.io.IOException;

public class Exec1 {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("notepad");
    }
}
