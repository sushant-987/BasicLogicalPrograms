package com.demo.logicalprograms.java;


import java.util.*;

public class HelloWorld{

    public static void main(String []args){
       LinkedList<String> linkedlist = new LinkedList<String>();

       linkedlist.add("Item1");
       linkedlist.add("Item2");
       linkedlist.add("Item3");
       linkedlist.add("Item4");
       linkedlist.add("Item5");

       System.out.println("Linked List Content: " +linkedlist);
       rotate(linkedlist, 2);
       System.out.println("Linked List Content: " +linkedlist);
    }

    public static void rotate(LinkedList linkedlist, int n) {
       for (int i=0; i<n; i++) {
           Object item = linkedlist.removeLast();
           linkedlist.addFirst(item);
       }
    }
}