package com.examples.core;

public class ElseIfLadderDemo {

    public static void main(String args[]){

        int number = 89;

        if(number < 0)
            System.out.println("WRONG INPUT");
        else if(number >=0 && number <=9) // && AND, || OR - LOGICAL Operators
            System.out.println("GIVEN NUMBER IS A SINGLE DIGIT");
        else if(number >=10 && number <=99)
            System.out.println("GIVEN NUMBER IS A DOUBLE DIGIT");
        else if(number >=100 && number <=999)
            System.out.println("GIVEN NUMBER IS A TRIPLE DIGIT");
        else if(number >=1000 && number <=9999)
            System.out.println("GIVEN NUMBER IS A FOUR DIGIT");
        else
            System.out.println("GIVEN NUMBER HAS MORE THAN FOUR DIGITS");

    }
}
