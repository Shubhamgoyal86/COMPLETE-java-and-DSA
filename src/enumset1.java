import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class enumset1 {

    enum  Days{
        Sunday,monday,tuesday
    }
    public static void main(String[] args) {
        Set<Days> din = EnumSet.of(Days.monday,Days.tuesday);
        Iterator itr = din.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        Set<Days> din2 = EnumSet.allOf(Days.class);
        Set<Days> din3 = EnumSet.noneOf(Days.class);
        System.out.println(din2);
        System.out.println(din3);
    }
}
