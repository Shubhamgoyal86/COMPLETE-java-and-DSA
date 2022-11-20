import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student1 implements Comparable<Student1>{
    int age,roll_no;
    String name;
    public Student1(int age,int roll_no,String name){
        this.age=age;
        this.roll_no=roll_no;
        this.name=name;
    }
    public int compareTo(Student1 st){
        if(age==st.age)
            return 0;

        else if(age<st.age)
            return  1;

        else
            return -1;

    }
}
public class Comparable_reverse_order {
    public static void main(String[] args) {
        ArrayList<Student1> ar1 = new ArrayList<>();
        ar1.add(new Student1(20,101,"Shubham"));
        ar1.add(new Student1(21,102,"Surya"));
        ar1.add(new Student1(22,103,"Ankit"));
        Collections.sort(ar1);

        for (Student1 s1 : ar1){
            System.out.println(s1.age+" "+s1.roll_no+" "+s1.name);
        }
    }
}
