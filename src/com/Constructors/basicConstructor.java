package com.Constructors;
public class basicConstructor {
    int num1,num2,result;
    public basicConstructor(int n,int o){
        num1=n;
        num2=o;
    }
    public static void main(String[] args) {
        basicConstructor bs = new basicConstructor(10,5);
        bs.result= bs.num1+ bs.num2;
        System.out.println(bs.result);

    }
}
