package com.demo;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListdemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        Collections.sort(cars);
        for(String i: cars)
            System.out.println(i);
        cars.remove(1);
        System.out.println(cars);
        cars.clear();
        for(String i: cars)
            System.out.println(i);
}}
