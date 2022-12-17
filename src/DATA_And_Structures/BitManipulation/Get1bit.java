package DATA_And_Structures.BitManipulation;

public class Get1bit {
    public static void main(String[] args) {
        int num =5;
        int pos=1;
        int mask=1<<pos;
        if ((mask&num)==0){
            System.out.println("zero value");
        }else {
            System.out.println("non - zero");
        }
        System.out.println("Set mask input 1 in 1 pos");
        int number=mask | num;
        System.out.println(number);

    }
}
