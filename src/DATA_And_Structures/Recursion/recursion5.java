package DATA_And_Structures.Recursion;

public class recursion5 {
    public static int calcPower(int x,int n){
        if (x==0){
            return 1;
        }
        if (n==0){
            return 1;
        }


        int xpowerm = calcPower(x,n-1);
        int xpoerz = x*xpowerm;
        return xpoerz;
    }
    public static void main(String[] args) {
        int ans = calcPower(2,5);
        System.out.println(ans);
    }
}
