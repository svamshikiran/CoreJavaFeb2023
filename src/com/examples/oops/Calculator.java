package com.examples.oops;

import java.sql.SQLOutput;

public class Calculator {

    double firstNumber;
    double secondNumber;

    Calculator(){
        System.out.println("CALCULATOR CONSTRUCTOR IS CALLED");
        firstNumber = 9.8;
        secondNumber = 6.5;
    }

    public Calculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    //METHOD OVERLOADING
    //Occurs in the same class
    //Method signatures are different
    protected double add(){ //Method Signature
        return firstNumber+secondNumber;
    }

    public double add(double thirdNumber){ //input parameter/arguments
        System.out.println(add());
        return firstNumber+secondNumber+thirdNumber;
    }

    public double subtract(){
        return firstNumber-secondNumber;
    }

    public double multiply(){
        return firstNumber*secondNumber;
    }

    public double divide() throws MyOwnException{
        return firstNumber/secondNumber;
    }
}
