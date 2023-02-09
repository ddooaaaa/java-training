package com.company;
import java.util.*;


import java.util.Set;

public class TranningHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        //HashSet is uniqe and not input order
        // LinkedHashSet is uniqe and is input
        // tree set is uniqe and sorted in console
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San  Fransisco");
        set.add("Biejing");
        set.add("New York");
        System.out.println(set);
        for(String s: set)
        {
            System.out.println(s.toUpperCase());
        }
        TreeSet <String> treeSet= new TreeSet<>(set);
        System.out.println("sorted treeset" + treeSet);
        System.out.println("first" +treeSet.first());
        System.out.println(treeSet.headSet("New York"));
        System.out.println(treeSet.tailSet("New York"));


    }
}
