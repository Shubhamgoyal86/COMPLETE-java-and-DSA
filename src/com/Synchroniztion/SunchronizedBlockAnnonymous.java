package com.Synchroniztion;
class Sender{
    public void SenerMsg(String msg){
        System.out.println("\nSending a Message :  "+msg);
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n"+ msg+" Message Sent Successfully");
    }
}
class SenderThreads extends Thread{
    private String msg;
    Sender sd;
    SenderThreads(String m,Sender obj){
        msg=m;
        sd=obj;
    }
    public void run(){
//        synchronized (sd){
            sd.SenerMsg(msg);
        }
//    }


}
public class SunchronizedBlockAnnonymous {
    public static void main(String[] args) {
        Sender sender =new Sender();
        SenderThreads sender1 = new SenderThreads("Shubham Goyal",sender);
        SenderThreads sender2 = new SenderThreads("Elocome To you",sender);
        SenderThreads sender3 = new SenderThreads("Dil de diya Galla",sender);

        sender1.start();
        sender2.start();
        sender3.start();

        try {
            sender1.join();
            sender2.join();
            sender3.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
