package com.demo;
class A{
    public A(){
        System.out.println("in A class");
    }
    public A(int i){

        System.out.println("Int A");
    }
    public void show(){
        System.out.println("Monday");
    }
}
class B extends A{
    public B(){
        super(6);//super method
        System.out.println("in B class");
    }
    public B(int i){
        super(i);
        System.out.println("Int B");
    }
//method override
    @Override
    public void show() {
        super.show();
        System.out.println("Tuesday");
    }
}
public class Supermethod {
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }
}
