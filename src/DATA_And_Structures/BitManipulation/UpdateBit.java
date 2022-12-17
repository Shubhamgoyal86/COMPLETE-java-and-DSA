package DATA_And_Structures.BitManipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        int num=5;
        int pos=0;
        int bitmask = 1<<pos;
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        if (oper==1){
            int result= bitmask | num;
            System.out.println(result);
        }else {
            int newbitmask = ~(bitmask);
            int res =newbitmask & num;
            System.out.println(res);
        }
    }
}
