package com.demo;
import java.util.*;
public class Listtoarray {
    public static void main(String[] args){
        List<String> fruit=new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("apple");
        fruit.add("Strawberry");
        //Converting Arraylist to Array
        String[] array=fruit.toArray(new String[fruit.size()]);
        System.out.println(Arrays.toString(array));
        System.out.println("Printing fruit list: "+fruit);
    }
}
