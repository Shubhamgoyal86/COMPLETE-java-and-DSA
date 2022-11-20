import java.util.EnumMap;
import java.util.Map;

public class ENummap1 {
    enum Days1{
        Monday, Tuesday, Wednesday, Thursday
    };
    public static void main(String[] args) {
        Map<Days1,Integer> map = new EnumMap<>(Days1.class);
        map.put(Days1.Thursday,4);
        map.put(Days1.Monday,1);
        map.put(Days1.Tuesday,2);
        map.put(Days1.Wednesday,3);
        System.out.println(map  );
    }
}
