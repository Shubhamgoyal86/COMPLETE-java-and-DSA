package DATA_And_Structures.Sorting;

public class InsertionSort1 {
    static void InsertionSort(int arr[],int n){
        for (int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
    int arr[]={5,3,4,12,45,78,14,32,41,17};
    int n= arr.length;
    InsertionSort(arr,n);
    for (int i=0;i<n;i++){
        System.out.print(arr[i]+" , ");
    }
}
}
