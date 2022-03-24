package com.demo;

public class Exception extends Throwable {
    public static void main(String[] args){
        int[] arr = new int[6];
        arr[5]=9;
        int i = 9/3;

        try{
            System.out.println("output is "+i);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.err.println("Error");
        }
        finally {
            System.out.println("Bye");
        }
    }
}
