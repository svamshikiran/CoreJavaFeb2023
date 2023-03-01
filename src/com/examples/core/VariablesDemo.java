package com.examples.core;

import com.examples.oops.Calculator;

public class VariablesDemo {

    public static void main(String args[]){
        //Variable initialization
        int firstNumber = 10;
        int secondNumber = 20;

        double result = firstNumber + secondNumber;

        System.out.println("ADD RESULT = "+result);

        firstNumber = 3;
        secondNumber = 8;

        result = secondNumber - firstNumber;

        System.out.println("SUBTRACT RESULT = "+result);

        result = secondNumber / (double)firstNumber; //Type Casting

        System.out.println("DIVIDE RESULT = "+result);

        result = secondNumber % firstNumber; //Mod operator

        System.out.println("REMINDER = "+result);


    }
}
