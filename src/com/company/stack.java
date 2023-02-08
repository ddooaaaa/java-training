package com.company;

import java.util.ArrayList;

public class stack<T> {
    private ArrayList<T> list = new ArrayList<>();
       public  int getsize(){
        return list.size();
        }
        public T peek(){
           return list. get(getsize()-1);
        }
        public void push ( T t){
           list.add(t);
        }
        public T  pop (){
           return list.remove(getsize()-1);

        }

    @Override
    public String toString() {
        return "stack{" +
                "list=" + list +
                '}';
    }
    public void print ( stack<?> s){
           while (!list.isEmpty())
        System.out.println(s.pop());


    }
}
