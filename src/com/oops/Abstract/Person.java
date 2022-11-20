package com.oops.Abstract;
interface Student{
    public void study();

}
interface Youtuber{
    public void makingVideo();

}

public class Person implements Student,Youtuber{
    public static void main(String[] args) {
        Person p = new Person();
        p.study();
        p.makingVideo();
        
    }
    public void study() {
        System.out.println("Studying......");

    }

    public void makingVideo() {
        System.out.println("Video Is Playing......");

    }
}
