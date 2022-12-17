package DATA_And_Structures;

import java.util.Scanner;

public class BinarySearch2 {
    public static void main(String[] args) {
        int n,i,item,c=0,start,end;
        int mid = 0;
        Scanner sc =new Scanner(System.in);
         n= sc.nextInt();
        int arr[]= new int[n];

        System.out.println("print the elements");
        for ( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements to search");
        item = sc.nextInt();

        start=0;
        end=n-1;
        while (start<=end){
             mid = start+(end-start)/2;
            if (item==arr[mid]){
                c++;
                break;
            }else if (item>arr[mid]){
                start =mid+1;

            }else if (item<arr[mid]){
                end=mid-1;
            }
        }
        if (c>0){
            System.out.println("item found at "+ mid);
        }else {
            System.out.println("item not found");
        }
    }
}
