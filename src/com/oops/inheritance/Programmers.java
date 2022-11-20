package com.oops.inheritance;
class Employyee{
    int salary= 20000;
}
public class Programmers extends Employyee {
    int bonus = 5000;
    public static void main(String[] args) {
        Programmers p = new Programmers();
        System.out.println(p.salary);
        System.out.println(p.bonus);

    }

}
