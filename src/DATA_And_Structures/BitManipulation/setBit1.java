package DATA_And_Structures.BitManipulation;

public class setBit1 {
    public static void main(String[] args) {
        int num=11;
//        while (num!=0){
//            if (num%2==1){
//                count++;
//
//            }
//            num=num>>1;
//        }
//        System.out.println(count);
        int count=Integer.bitCount(num);
        System.out.println(count);


    }
}
