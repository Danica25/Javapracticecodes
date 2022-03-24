package com.demo;
import java.util.*;
public class HashmapDemo {
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("1","Mango");
        map.put("2","Apple");
        map.put("3","Banana");
        map.put("4","Grapes");
        //no duplicate keys.hashmap avoids it.it override the original.
        map.put("1","orange");
System.out.println("output after put method..");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.putIfAbsent("5","kiwi");
        System.out.println("output after putifabsent method..");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<String,String> hmp = new HashMap<String, String>();
        hmp.put("6","pineapple");
        hmp.putAll(map);
        System.out.println("output after putALL method..");
        for(Map.Entry m : hmp.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
    //key-based removal


}
