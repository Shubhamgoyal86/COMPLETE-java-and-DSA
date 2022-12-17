package DATA_And_Structures.Sorting;

public class ArraySortForCyclicSort {
    public void cyclicSort(int [] arr){
        if (arr.length<=1){
            return;
        }
        int i=0;
        while (i<arr.length){
            if (arr[i]!=i+1){
                int DestinationIndex= arr[i]-1;

                int x= arr[i];
                arr[i] =arr[DestinationIndex];
                arr[DestinationIndex]=x;
            }
            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] =new int[]{5,1,4,3,6,2};
        ArraySortForCyclicSort sg  =new ArraySortForCyclicSort();
        sg.cyclicSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
