package com.examples.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

        HashSet<Double> set = new HashSet<>();

        set.add(12.0);
        set.add(12.30);
        set.add(16.9);
        set.add(34.5);

        set.add(12.30);

        set.forEach(item->{ //forEach method introduced in Collections in Java 1.8
            System.out.println("EACH ITEM: "+item);
        });

        TreeSet<Double> treeSet = new TreeSet<>();

        treeSet.add(12.0);
        treeSet.add(12.30);
        treeSet.add(16.9);
        treeSet.add(34.5);

        treeSet.forEach(item->{ //forEach method introduced in Collections in Java 1.8
            System.out.println("TREE SET - EACH ITEM: "+item);
        });
    }
}
