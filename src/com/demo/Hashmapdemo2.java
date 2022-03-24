package com.demo;
import java.util.*;
public class Hashmapdemo2 {
    public static void main(String[] args){
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        hm.put(103, "Gaurav");
        System.out.println(hm);
        hm.replace(101,"Gokul");
        System.out.println("Updated list of elements:");

        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.replace(100,"Amit","Dharshan");
        System.out.println("Updated list...");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("implementing remove methods..");
        //key-based removal

        hm.remove(100);
        System.out.println(hm);
        //value-based removal
        hm.remove(101);
        System.out.println(hm);
        //key-value pair based removal
        hm.remove(102,"Rahul");
        System.out.println(hm);
        hm.replaceAll((k,v) -> "amit");
        System.out.println("Updated list..");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
