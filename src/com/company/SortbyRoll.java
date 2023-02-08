package com.company;
import java.util.*;
import java.util.Comparator;
import  java.lang.*;

public class SortbyRoll implements  Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.roolno - b.roolno;


    }
}
    class Sortbyname implements  Comparator<Student>{
    public  int  compare (Student a,Student b){
      return   a.name.compareTo(b.name);

    }
}
