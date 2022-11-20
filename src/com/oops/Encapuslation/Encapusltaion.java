package com.oops.Encapuslation;

 class Stuent{
     private String name;
     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name = name;
     }

}
public class Encapusltaion {
    public static void main(String[] args) {
        Stuent st = new Stuent();
        st.setName("Shubham Goyal");
        System.out.println(st.getName());
    }
}
