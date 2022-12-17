package DATA_And_Structures.Sorting;

public class Selesctionsort1 {
    static void SelectionSort(int arr[],int n){
        for (int i=0;i<n;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min]){
                    min=j;

                }
            }
            int temp =arr[i];
            arr[i]=arr[min];
            arr[min]= temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,4,3};
        int n= arr.length;
        SelectionSort(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" , ");
        }
    }
}
