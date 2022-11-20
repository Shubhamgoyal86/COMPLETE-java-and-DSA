package com.InnerClass;

public class Annonymous {
    private  int data= 30;
     void display(){
        class Local{
            void msg(){
                System.out.println(data);
            }
        }
        Local l =new Local();
        l.msg();
    }

}
class  Anno{
    public static void main(String[] args) {
        Annonymous an = new Annonymous();
        an.display();
    }
}
