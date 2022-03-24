package com.demo;
class Emp{
    int eid;
    int salary;
    static String ceo,company;
   public  Emp(){
       //excutes when a obj is created
       eid=100;
       salary=3000;
       System.out.println("this is constructor");
   }
   static {
       //excutes when a class loads
       ceo="Naren";
       company="xyz";
       System.out.println("this is static");
   }
    public void display(){
        System.out.println("empid :"+eid);
        System.out.println("salary :"+salary);
        System.out.println("CEO :"+ceo);
        System.out.println("Company :"+company);
    }
}
public class StaticExp {
    public static void main(String[] args){
        Emp obj = new Emp();
        Emp obj1 = new Emp();
        obj.display();
        obj1.display();
    }
}
