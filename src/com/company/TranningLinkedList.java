package com.company;

import java.util.LinkedList;
import java.lang.Integer;
public class TranningLinkedList {
        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<Integer>();
            linkedList.add(1);
            linkedList.add(2);
            linkedList.add(3);
            linkedList.add(4);
            System.out.println(linkedList);
            while (!linkedList.isEmpty())
                System.out.println(linkedList.remove());
        }
    }



