package com.demo;
//don't need clas for implenting interface . it can be done through
//anonymous class
interface Towrite{
    void display();
}
public class Anonyinter {
    public static void main(String[] args){
        Towrite sc = new Towrite() {
            @Override
            public void display() {
                System.out.println("Display the content");
            }
        };
        sc.display();
    }
}
