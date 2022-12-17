package DATA_And_Structures;

import java.util.NoSuchElementException;

class CiruclarSingle{

    private ListNode Last;
    private  int length;
    private  class ListNode{
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data=data;
        }
    }
    public CiruclarSingle(){
        Last=null;
        length=0;
    }
    public  int Length(){
        return Length();
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void Transverse(){
        if (Last==null){
            return;
        }
        ListNode first = Last.next;
        while (first!=Last){
            System.out.print(first.data+"--->");
            first=first.next;
        }
        System.out.println(first.data);
    }
    public void insertFirst(int val){
        ListNode temp = new ListNode(val);
        if (Last==null){
            Last=temp;
        }else {
            temp.next = Last.next;
        }
        Last.next=temp;
        length++;

        }
        public void insertLast(int val){
        ListNode temp =new ListNode(val);
        if (Last==null){
            Last=temp;
            Last.next=Last;
        }else {
            temp.next=Last.next;
            Last.next=temp;
        }
        Last=temp;
            length++;

        }
        public void deleteFirst(){
        ListNode temp = Last.next;
        if (Last==null){
            throw  new NoSuchElementException();
        }else {
            if (Last.next==Last){
                Last=null;

            }else {
                Last.next=temp.next;

            }
            temp.next=null;
            length--;
        }
        }

    }

public class CircularSinglyLinkedList {
    public static void main(String[] args) {

        CiruclarSingle cs1 = new CiruclarSingle();
        cs1.insertFirst(45);
        cs1.insertFirst(65);
        cs1.insertFirst(75);
        cs1.insertFirst(95);
        cs1.insertLast(100);
        cs1.deleteFirst();
        cs1.deleteFirst();
        cs1.deleteFirst();
        cs1.deleteFirst();
         cs1.deleteFirst();

        cs1.Transverse();

    }
}
