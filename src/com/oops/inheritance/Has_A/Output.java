package com.oops.inheritance.Has_A;
class Employee{
    int id;
    String Name;
    Address address;

   public Employee(int id,String Name,Address address){
       this.id=id;
       this.address=address;
       this.Name=Name;
   }
   void display(){
       System.out.println("Your Addreess Will be: ");
       System.out.println(id+" "+Name+" "+address.city+","+address.state+","+address.country);
   }
}


public class Output {
    public static void main(String[] args) {
        Address a1 = new Address("Jodhpur","Raj","India");
        Address a2 = new Address("Noida","Delhi","India");



        Employee emp1= new Employee(25,"Shubham",a1);
        Employee emp2= new Employee(26,"AAKash",a2);

        emp1.display();
        emp2.display();
    }

}
