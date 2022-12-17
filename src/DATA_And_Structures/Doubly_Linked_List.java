package DATA_And_Structures;

import java.util.NoSuchElementException;
import java.util.Scanner;

class DoublyLinkedList{
    private ListNode head;
    private ListNode tail;
    private int length;



class ListNode {
    private int data;
    private ListNode next;
    private ListNode previous;

    public ListNode(int data) {
        this.data = data;

    }
}
public DoublyLinkedList(){
    this.head=null;
    this.tail=null;
    this.length=0;


}
public  boolean isEmpty(){
    return length==0; // head--null
}
public int length(){
    return length;
}
public void DisplayForward(){
    if (head==null){
        return;
    }
    ListNode temp =head;
    while (temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println("null");
}

public void DisplayBackward(){
    if (tail==null){
        return;
    }
    ListNode temp =tail;
    while (temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.previous;
    }
    System.out.println("null");
    }
    public void InsertFirst(int val){
    ListNode newNode =new ListNode(val);
    if (isEmpty()){
        tail=newNode;
    }
    else {
        head.previous=newNode;
    }
    newNode.next=head;
    head=newNode;
    length++;
}
    public void InsertLast(int val){
    ListNode newNode = new ListNode(val);
    if (isEmpty()){
        head=newNode;
    }
    else {
        tail.next=newNode;
        newNode.previous=tail;
    }
    tail=newNode;
    length++;
    }
    public void insertAt(int val,int pos){
        ListNode newNode = new ListNode(val);
    if (head==null){
        if (pos==1){
            InsertFirst(val);
        }else {
            System.out.println("Please return write statements");
        }
    }
    if (pos==1){
        InsertFirst(val);
    }else {
        head.next = tail.next;
        tail.next=head;
        head.previous=tail;
    }

    }





    public void deleteFirst(){
    if (isEmpty()){
        throw new NoSuchElementException();
    }
    ListNode temp =head;

    if (head==tail) {
        tail=null;
    }else {
        head.next.previous=null;

    }
        head=head.next;
    temp.next=null;
    length--;
    }
    public void deleteLast(){
    if (isEmpty()){
        throw new  NoSuchElementException();
    }
    ListNode temp =tail;
    if (tail==head){
        head=null;
    }else {
        tail.previous.next=null;
    }
    tail=tail.previous;
    temp.previous=null;
    length--;
    }


}



public class Doubly_Linked_List
{
    public static void main(String[] args) {
        DoublyLinkedList ds1 = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        boolean flag =true;
        while (flag) {
            System.out.println("1. Search the element");
            System.out.println("2. insert At Start");
            System.out.println("3. insert At end");
            System.out.println("4. insert at position");
            System.out.println("5. Delete  At Start");
            System.out.println("6. Delete  At end");
            System.out.println("7. Delete at position");
            System.out.println("8. View List");
            System.out.println("9. Exit");
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();

            int position, val;

            switch (choice) {
//                case 1:
//                    System.out.println("Enter the number to be search");
//                    val=sc.nextInt();
//                    ds1.Searching(val);
//                    break;
                case 2:
                    System.out.println("enter The value of the elemnt");
                    val = sc.nextInt();
                    ds1.InsertFirst(val);
                    break;
                case 3:
                    System.out.println("enter The value of the elemnt");
                    val = sc.nextInt();
                    ds1.InsertLast(val);
//                    break;
//                case 4:
//                    System.out.println("Enter the Position");
//                    position = sc.nextInt();
//                    System.out.println("enter the value of the eleement");
//                    val = sc.nextInt();
//                    ds1.InsertPos(val, position);
//                    break;
                case 5:
                    ds1.deleteFirst();
                    break;
                case 6:
                    ds1.deleteLast();
                    break;
//                case 7:
//                    System.out.println("Enter the Position");
//                    position = sc.nextInt();
//                    ds1.deleteAtPos(position);
//                    break;
                case 8:
                    ds1.DisplayForward();
                    break;
                case 9:
                    flag=false;
                default:
                    System.out.println("invalid Choice");
            }
        }
    }
}
