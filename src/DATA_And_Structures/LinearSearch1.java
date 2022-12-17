package DATA_And_Structures;

import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {
        int i=0;
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];

        System.out.println("print the elements");
        for ( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements to search");
        int srch = sc.nextInt();

        int c=0;
        for ( i=0;i<arr.length;i++) {
            if (arr[i] == srch) {
                c++;
                break;
            }
        }


            if (c > 0) {
                System.out.println("Item found "+i);
            } else {
                System.out.println("item not found");
            }
    }
}
