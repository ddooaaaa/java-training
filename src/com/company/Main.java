package com.company;

import java.util.ArrayList;
import java.lang.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList <Student> ar= new ArrayList<Student>();
        ar.add(new Student(111,"ccc","london"));
        ar.add(new Student(131,"aaa","london"));
        ar.add(new Student(121,"bbb","london"));
        for (int i =0;i<ar.size();i++)
        System.out.println((Student)ar.get(i));
        Collections.sort(ar, new Sortbyname());
        for (int i =0;i<ar.size();i++)
            System.out.println("Sortbyname "+ (Student)ar.get(i));


    }
}
