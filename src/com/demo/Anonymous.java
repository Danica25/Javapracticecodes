package com.demo;
class Abs{
    public void show(){
        System.out.println("am in A class");
    }
}
public class Anonymous {
    public static void main(String[] args){
        Abs obj=new Abs(){
            //anonymous class

            @Override
            public void show() {
                super.show();
                System.out.println("am in anonymous");
            }
        };
        obj.show();
    }
}
