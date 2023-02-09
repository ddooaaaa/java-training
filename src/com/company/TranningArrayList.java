package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class TranningArrayList {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "ccc", "london"));
        ar.add(new Student(131, "aaa", "london"));
        ar.add(new Student(121, "bbb", "london"));
        for (int i = 0; i < ar.size(); i++)
            System.out.println((Student) ar.get(i));
        Collections.sort(ar, new Sortbyname());
        for (int i = 0; i < ar.size(); i++)
            System.out.println("Sortbyname " + (Student) ar.get(i));
        System.out.println(" do3a2");

    }}

