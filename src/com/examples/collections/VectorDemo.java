package com.examples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<Double> vector = new java.util.Vector<>();

        vector.addElement(12.0);
        vector.addElement(12.30);
        vector.addElement(16.9);
        vector.addElement(34.5);


        vector.remove(1);

        for(Double listItem : vector){
            System.out.println("ITEM: "+listItem);
        }

        vector.forEach(item->{ //forEach method introduced in Collections in Java 1.8
            System.out.println("EACH ITEM: "+item);
        });
    }
}
