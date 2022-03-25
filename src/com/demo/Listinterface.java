package com.demo;
import java.util.*;
import java.util.ArrayList;

public class Listinterface {
    public static void main(String[] args){
        List <String> list=new ArrayList<String>();
        //Adding elements in the list
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //iterating the list element using for-each loop
        for(String fruit:list)
            System.out.println(fruit);
    }
}


