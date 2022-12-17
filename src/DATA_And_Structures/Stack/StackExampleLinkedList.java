package DATA_And_Structures.Stack;

public class StackExampleLinkedList {
    static class Node{
        Node next;
        int data;
      public Node(int data){
            this.data=data;
            next=null;
        }
    }


static class Stock2{
           public   static Node head;
            public static boolean isEmpty(){
                 return head==null;
            }
            public static  void push(int val){
                Node newNode = new Node(val);
                if (isEmpty()){
                    head=newNode;
                    return;
                }
                    newNode.next=head;
                    head=newNode;


            }
            public static int  pop(){
                if (isEmpty()){
                    return -1;
                }
                int top=head.data;
                head=head.next;
                return top ;

            }
            public static int peek(){
                if (isEmpty()){
                    return -1;
                }else {
                    return head.data;
                }
            }
        }
}

class Toast {
    public static void main(String[] args) {
        StackExampleLinkedList.Stock2 sds  = new StackExampleLinkedList.Stock2();
        sds.push(45);
        sds.push(55);
        sds.push(65);
        sds.push(95);
        sds.push(105);
        while (!sds.isEmpty()){
            System.out.println(sds.peek());
            sds.pop();

        }

    }
}


