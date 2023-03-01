package com.examples.core;

public class LoopsDemo {
    public static void main(String args[]){
        int number = 10;
        for ( ; number >= 1; ){
            System.out.println(number);
            number--;
        }
        System.out.println("NUMBER VALUE AT THE END - "+number);
    }
}
