package com.demo;
//this code displays the output with sleep time (pause time) using thread.
class Welcome {
    public void show(){
        for(int i=1;i<=5;i++){
            System.out.println("Welcome buddy..");

        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
}}
class Hello extends Thread{
    public void show(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello all");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args ){
        Welcome obj1 = new Welcome();
        Hello obj2 = new Hello();
        obj1.show();
        obj2.show();
    }
}
