package DATA_And_Structures.Sorting;

public class MergeSort1 {
    public void printArray(int arr[]){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void sort(int arr[],int temp[],int start,int end){
        if (start<end){
            int mid = start+(end-start)/2;
            sort(arr,temp,start,mid);
            sort(arr,temp,mid+1,end);
            merge(arr,temp,start,mid,end);
        }
    }

    private void merge(int[] arr, int[] temp, int start, int mid, int end) {
        for (int i=start;i<=end;i++){
                 temp[i]=arr[i];

        }
        int i=start; //traverse left sorted subaarray
        int j=mid+1; // traverse right sorted sub array
        int k=start; //  will merge both arrays into original sub array

        while (i<=mid && j<=end){
            if (temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }
            else {
                arr[k]=temp[j];
                j++;
            }
            k++;

        }
        while (i<=mid){
            arr[k]=temp[i];
            k++;
            i++;

        }
    }

    public static void main(String[] args) {
        int arr[]= new int []{9, 5, 2, 4, 3};
        MergeSort1 ms = new MergeSort1();
        ms.sort(arr,new int[arr.length],0,arr.length-1);
        ms.printArray(arr);
    }

}
