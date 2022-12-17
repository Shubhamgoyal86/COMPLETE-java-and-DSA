package DATA_And_Structures.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackArrayListExample {
    static class Stock{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stock st = new Stock();
        st.push(45);
        st.push(95);
        st.push(44);
        st.push(43);
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
