package com.demo;
import java.util.*;
import java.util.TreeSet;
public class TreeSetexamp {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        Iterator<String> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator<String> itr1 = ts.descendingIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("Highest Value: "+ts.pollFirst());
        System.out.println("Lowest Value: "+ts.pollLast());
        System.out.println("Initial Set: "+ts);

        System.out.println("Reverse Set: "+ts.descendingSet());

        System.out.println("Head Set: "+ts.headSet("C", true));

        System.out.println("SubSet: "+ts.subSet("A", false, "E", true));

        System.out.println("TailSet: "+ts.tailSet("C", false));
    }
}
