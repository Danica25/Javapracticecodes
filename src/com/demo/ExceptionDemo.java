package com.demo;

import org.omg.CORBA.UserException;

public class ExceptionDemo {
    public ExceptionDemo(String s) {
        ;
    }

    public static void main(String[] args){
        int i,j;
        i=8;
        j=9;
        try
        {
            int k =i/j;
            if(k==0){
                 throw new UserDef("NOT A CORRECT WAY");

            }
            System.out.println(k);
        }
        catch (UserDef e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
