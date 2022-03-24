package com.demo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListdemo {
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.addFirst("Mazda");
        System.out.println(cars);
        cars.addLast("Audi");
        Iterator<String> al=cars.iterator();
        while(al.hasNext()){
            System.out.println(al.next());
        }
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        cars.removeFirst();
        System.out.println(cars);
        cars.removeLast();
        System.out.println(cars);
    }
}
