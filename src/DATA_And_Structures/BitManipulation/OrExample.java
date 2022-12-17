package DATA_And_Structures.BitManipulation;

public class OrExample {
    public static int[] game_with_number (int arr[], int n) {

        for (int i=0;i<n-1;i++){
            arr[i]=arr[i] | arr[i+1];
        }
        return arr;// Complete the function
    }

    public static void main(String[] args) {
        int arr[] =new int[]{10,11,1,2,3};
        int n = arr.length;
        game_with_number(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" , ");
        }

    }




}
