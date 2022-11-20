package com.String;
class Employyee{
    final  String panCardNumber;
    public Employyee(String panCardNumber) {
        this.panCardNumber = panCardNumber;
    }
    public String getPanCardNumber(){
        return panCardNumber;
    }
}
public class ImmutableString {
    public static void main(String[] args) {
        Employyee e = new Employyee("ABC123");
        String s1 = e.getPanCardNumber();
        System.out.println("PenCard Number : "+s1 );
    }
}
