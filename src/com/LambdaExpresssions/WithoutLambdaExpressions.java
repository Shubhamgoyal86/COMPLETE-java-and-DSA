package com.LambdaExpresssions;

interface Drawable{
    public void draw();
}
public class WithoutLambdaExpressions {
    public static void main(String[] args) {
        int width=10;
        Drawable d = new Drawable() {

            public void draw() {
                System.out.println("shubham Goyal "+width);
            }
        };
        d.draw();
    }
}
