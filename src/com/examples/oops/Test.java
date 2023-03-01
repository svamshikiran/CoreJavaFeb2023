package com.examples.oops;

public class Test {

    public static void main(String[] args) {

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println("PROGRAM STARTED AFTER CREATING THE OBJECT");
        System.out.println("FIRST NUMBER: "+scientificCalculator.firstNumber);
        System.out.println("SECOND NUMBER: "+scientificCalculator.secondNumber);
        System.out.println("ADD RESULT: "+scientificCalculator.add());
        System.out.println("ADD THREE NUMBER RESULT: "+scientificCalculator.add(4.5));
        try {
            System.out.println("DIVIDE RESULT: " + scientificCalculator.divide());
        }
        catch (Exception ex){
            System.out.println("EXCEPTION THROWN: "+ex.getLocalizedMessage());
        }


        ScientificCalculator scientificObj = new ScientificCalculator(10.7, 0, 45);
        System.out.println("PROGRAM STARTED AFTER CREATING THE OBJECT");
        System.out.println("FIRST NUMBER: "+scientificObj.firstNumber);
        System.out.println("SECOND NUMBER: "+scientificObj.secondNumber);
        System.out.println("ADD RESULT: "+scientificObj.add());
        System.out.println("ADD THREE NUMBER RESULT: "+scientificObj.add(4.5));
        try{
            System.out.println("DIVIDE RESULT: "+scientificObj.divide());
        }
        catch (Exception ex){
            System.out.println("EXCEPTION THROWN: "+ex.getLocalizedMessage());
        }
/*
        scientificCalculator.angle = 45;

        System.out.println("SIN VALUE: "+scientificCalculator.sinValue());
        System.out.println("COS VALUE: "+scientificCalculator.cosValue());*/

        double result = Math.pow(5,5);
        System.out.println("RESULT: "+result);
    }
}
