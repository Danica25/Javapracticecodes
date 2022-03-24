package com.demo;

public class Personhello {
     String personname;

    public Personhello(String personname){
        this.personname = personname;
    }
    public Personhello(){
        /*just a empty constructor*/
    }
    public String hello(){
        return "hello world";
    }
    public String hellod(String personname){
        return "Hello "+personname;
    }
}
