package com.demo;
//this code prints the output alternative based on the execution time.

class Wel extends Thread{
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
class Hel extends Thread{
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


public class ThreadAlterOut {
    public static void main(String[] args ){
        Wel obj1 = new Wel();
        Hel obj2 = new Hel();
        //Thread has start method
        obj1.start();
        //to avoid the clash between the execution.
        try{
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
