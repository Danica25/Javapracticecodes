package com.demo;
class CarCo{
    void color(){     //superclass,parent,base
        System.out.println("Black");
    }
}
class CarModel extends CarCo{ //multilevel inheritance   //subclass,child,derived
    void model(){
        System.out.println("BMW");
    }
}
class CarId extends CarModel{
    void id_no(){
        System.out.println("110923478698");
    }
}
public class Inheritancedemo {
    public static void main(String[] args){
        CarId obj = new CarId();
        obj.color();
        obj.id_no();
        obj.model();
    }
}
