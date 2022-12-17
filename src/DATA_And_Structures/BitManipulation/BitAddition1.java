package DATA_And_Structures.BitManipulation;

public class BitAddition1 {
    public static void main(String[] args) {
//      int a=5,b=3;
//      for (int i =0;i<b;i++)a++;
//        System.out.println(a);
        int a=5,b=3;
        while (b!=0){
            int carry = a&b;
            a=a^b;
            b=carry<<1;
        }
        System.out.println(a);

    }
}
