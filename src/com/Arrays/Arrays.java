package com.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{3,4,5},{4,5,6}};
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
