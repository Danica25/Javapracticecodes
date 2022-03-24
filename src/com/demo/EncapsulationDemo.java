package com.demo;
//encapsulation is binding of data with methods
class Student{
    private int rollno;
    private String name;

    //to access -> need getter and setter method
    //the members should be private and the method should be public
    public void setRollno(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setRollno(18022,"Danica");
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}
