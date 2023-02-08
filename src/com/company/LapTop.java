package com.company;
import java.util.*;
import java.util.Comparator;
public class LapTop implements Comparator<LapTop>  {

    String name;
    int ran;
    int price;

    public LapTop(String name, int ran, int price) {
        super();
        this.name = name;
        this.ran = ran;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRan() {
        return ran;
    }

    @Override
    public int compare  ( LapTop o1 ,LapTop o2)
    {
       if (o1.getRan()> o2.getRan() )
           return getRan();
       else
           return o2.getRan();
    }
}
