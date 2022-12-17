package DATA_And_Structures.BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int num = 5;
        int pos = 2;
        int mask = 1 << pos;
        int notbitmask = ~(mask);
        System.out.println("Clear the number of 2 pos");
        int clear = notbitmask & num;
        System.out.println(clear);
    }
}
