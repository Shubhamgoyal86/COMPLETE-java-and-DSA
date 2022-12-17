package DATA_And_Structures.Stack;

import java.util.Stack;

public class StackBottom {
    public static void pushAtBottom(int data, Stack<Integer> st){
        if (st.isEmpty()){
            st.push(data);
            return;
        }
        int top =st.pop();
        pushAtBottom(data,st);
        st.push(top);
    }
    public  static  void reverse(Stack<Integer> st){
        if (st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(top,st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(2);
        st.push(1);
        reverse(st);

//        pushAtBottom(4,st);
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
