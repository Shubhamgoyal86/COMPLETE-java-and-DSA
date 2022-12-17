package DATA_And_Structures.Sorting;

public class BUbbleSort1 {
    static void BubbleSort(int arr[],int n) {

        boolean flag;
        for (int i=0;i<n;i++){
            flag=false;
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (flag==false){
                break;
            }
        }


    }

    public static void main(String[] args) {
        int arr[]= {6,7,15,45,2,12,5,6};
        int n= arr.length;
        BubbleSort(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" , ");
        }
    }

}
