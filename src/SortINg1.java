import com.Arrays.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student> {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public int compareTo(Student person) {
        return name.compareTo(person.name);
    }
}
        public class SortINg1 {

            public static void main(String[] args) {
                ArrayList<Student> ar1 = new ArrayList<>();
                ar1.add(new Student("Shubham"));
                ar1.add(new Student("Sanju"));
                ar1.add(new Student("Ranjeet"));
                Collections.sort(ar1);
                for (Student s2 :ar1){
                    System.out.println(s2.name);
                }

            }
        }

