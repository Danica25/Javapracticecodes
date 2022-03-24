package com.demo;
interface simple{
    void show();
}
public class Lamdafunc {
    public static void main(String[] args){
        //lamdafunction : should in the interface functionality which has 1 method
        simple obj =() -> System.out.println("you are good!");
        obj.show();
    }
}
