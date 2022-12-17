package DATA_And_Structures.BitManipulation;

public class BitCaluclations {

    public static void main(String[] args) {
        int count=0;
        int num=11;
        while (num!=0){
           int i=num>>1;
           num=i;
           count++;
    }
        System.out.println(count);
}

}
