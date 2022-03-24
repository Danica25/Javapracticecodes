package com.demo;
    //this code implements runnable interface

class Welc implements Runnable{
    public void run(){
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
class Helo implements Runnable{
    public void run(){
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




public class RunInter {
    public static void main(String[] args ){
        Runnable obj1 = new Welc();
        Runnable obj2 = new Helo();
        //to use the thread method start in runnable interface, we have to create a object for thread.And pass the class obj into thread as parameter.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        //Thread has start method
        t1.start();
        //to avoid the clash between the execution.
        try{
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
