package com.examples.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Double> llist = new LinkedList<>();

        llist.add(12.0);
        llist.add(12.30);
        llist.add(16.9);
        llist.add(34.5);

        llist.add(2, 15.8);

        llist.remove(1);

        llist.forEach(item->{ //forEach method introduced in Collections in Java 1.8
            System.out.println("EACH ITEM: "+item);
        });
    }
}
