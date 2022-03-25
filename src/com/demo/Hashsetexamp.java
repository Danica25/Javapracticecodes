package com.demo;
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
public class Hashsetexamp {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("vijay");
        list.add("Ajay");

        //hashset from another collection.

        HashSet<String> hash = new HashSet(list);
        hash.add("Gokul");
        Iterator<String> i = hash.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
