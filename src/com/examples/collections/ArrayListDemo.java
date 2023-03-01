package com.examples.collections;

import com.examples.oops.Calculator;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Double> arrayList = new ArrayList<>();

        arrayList.add(12.0);
        arrayList.add(12.30);
        arrayList.add(16.9);
        arrayList.add(34.5);

        arrayList.add(2, 15.8);

        arrayList.remove(1);

        for(Double listItem : arrayList){
            System.out.println("ITEM: "+listItem);
        }

        arrayList.forEach(item->{ //forEach method introduced in Collections in Java 1.8
            System.out.println("EACH ITEM: "+item);
        });
    }
}
