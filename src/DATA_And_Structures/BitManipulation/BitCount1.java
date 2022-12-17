package DATA_And_Structures.BitManipulation;

public class BitCount1 {
    public static void main(String[] args) {
        int[] a =new int[]{2,1,3,3,2};
        int ans =0;
        for (int i=0;i<a.length;i++){
            ans = ans^a[i];

        }
        System.out.println(ans);
    }
}
