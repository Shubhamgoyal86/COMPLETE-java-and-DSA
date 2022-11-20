package DATA_And_Structures;

import java.util.Scanner;

class Node{
    private int data;
     private Node next;


    public Node(){
        data = 0;
        next =null;
    }
    public Node(int d,Node n){
        data=d;
        next=n;
    }
    public void setData(int d) {
        data = d;
    }

    public void setNext(Node n) {
        next = n;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

public class LinkedList1 {
    public  int size;
    public Node start;
    public LinkedList1(){
        size=0;
        start=null;
    }
    public Boolean isEmpty(){
        if (start==null){
            return (true);
        }
        else return (false);
    }
    public int  getListSize(){
        return size;
    }
    public void viewList(){
        Node t;
        if (isEmpty()){
            System.out.println("Is Empty");
        }
        else {
            t=start;
            for (int i=1;i<=size;i++){
                System.out.println(" "+ t.getData());
                t=t.getNext();
            }
        }
    }
    public void InsertFirst(int val){
        Node n;
        n= new Node();
        n.setData(val);
        n.setNext(start);
        start=n;
        size++;


    }
    public void InsertLast(int val){
        Node t,n;
        n= new Node();
        n.setData(val);
        t=start;
        if (t==null){
            start=n;

        }
        else {
            while (t.getNext()!=null){
                t=t.getNext();
            }
            t.setNext(n);
        }
        size++;
    }
    public void InsertPos(int val,int pos){
        if (pos==1){
            InsertFirst(val);
        } else if (pos==size+1) {
            InsertLast(val);
            
        } else if (pos>1&&pos<=size) {
            Node n,t;
            n= new Node(val,null);
            t=start;
            for (int i=1;i<pos-1;i++){
                t=t.getNext();

            }
            n.setNext(t.getNext());
            t.setNext(n);
            size++;

        }
        else {

            System.out.println("Wrong Position ");
        }
    }
    public void deleteFirst(){
       if (start==null){
           System.out.println("Already Empty");
       }
       else {
           start=start.getNext();
           size--;
       }
    }
    public void deleteLast(){
        if (start==null){
            System.out.println("Already empty");
        } else if (size==1) {
            start=null;
            size--;

        }
        else {
            Node t;
            t=start;
            for (int i=1;i<size-1;i++){
                t=t.getNext();
            }
            t.setNext(null);
            size--;
        }
    }
    public void deleteAtPos(int pos){
        if (start==null){
            System.out.println("Already empty");
        } else if (pos<1||pos>size) {
            System.out.println("Wrong Positions");
            
        } else if (pos==1) {
            deleteFirst();

        } else if (pos==size) {
            deleteLast();
        }
        else {
            Node t,t1;
            t=start;
            for (int i=1;i<pos-1;i++){
                t=t.getNext();
            }
            t1=t.getNext();
            t.setNext(t1.getNext());
            size--;
        }

    }
    public void Searching(int val){
        Node t= start;
        int i=1;
        boolean flag=false;
        if (start==null){
            System.out.println("List is empty");
        }
        else {
            while (t!=null){
                if (t.getData()==val){
                    flag=true;
                    break;
                }
                i++;
                t=t.getNext();
            }
        }
        if (flag){
            System.out.println("Element is at position "+i);
        }else {
            System.out.println("Element is not present in list");
        }
    }

}
class Test {
    public static void main(String[] args) {
        LinkedList1 ls1 = new LinkedList1();
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
                case 1:
                    System.out.println("Enter the number to be search");
                    val=sc.nextInt();
                    ls1.Searching(val);
                    break;
                case 2:
                    System.out.println("enter The value of the elemnt");
                    val = sc.nextInt();
                    ls1.InsertFirst(val);
                    break;
                case 3:
                    System.out.println("enter The value of the elemnt");
                    val = sc.nextInt();
                    ls1.InsertLast(val);
                    break;
                case 4:
                    System.out.println("Enter the Position");
                    position = sc.nextInt();
                    System.out.println("enter the value of the eleement");
                    val = sc.nextInt();
                    ls1.InsertPos(val, position);
                    break;
                case 5:
                    ls1.deleteFirst();
                    break;
                case 6:
                    ls1.deleteLast();
                    break;
                case 7:
                    System.out.println("Enter the Position");
                    position = sc.nextInt();
                    ls1.deleteAtPos(position);
                    break;
                case 8:
                    ls1.viewList();
                    break;
                case 9:
                        flag=false;
                default:
                    System.out.println("invalid Choice");
            }
        }

    }
}
