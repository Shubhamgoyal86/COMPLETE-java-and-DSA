package com.Arrays;

public class jaggedarray {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0]=new int [3];
        arr[1]=new int [4];
        arr[2]=new int [2];

        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[1][3]=7;
        arr[2][0]=8;
        arr[2][1]=9;


//        int count =0;
//        for (int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                arr[i][j] = count++;
//            }
//        }
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
