package com.company;

public class Student  {
    int roolno;
    String name,address;
    public Student (int roolno,String name,String address){
        this.roolno=roolno;
        this.name=name;
        this.address=address;

    }

    public int getRoolno() {
        return roolno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roolno=" + roolno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

