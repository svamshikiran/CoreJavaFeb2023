package com.examples.oops;

public class ScientificCalculator extends Calculator{

    ScientificCalculator(){
        System.out.println("SCIENTIFIC CONSTRUCTOR IS CALLED");
    }

    double angle;

    ScientificCalculator(double firstNumber, double secondNumber, double angle){
        super(firstNumber, secondNumber);
        this.angle = angle;
    }

        public double sinValue(){
            return Math.sin(angle);
        }

    public double cosValue(){
        return Math.cos(angle);
    }

    public double tanValue(){
        return Math.tan(angle);
    }
    //METHOD OVERRIDING
    //Occurs in super and base classes
    //Method signature is same
    public double divide() throws MyOwnException{
        if(secondNumber == 0){
          throw new MyOwnException("DIVIDE BY ZERO IS NOT POSSIBLE, PLEASE CHECK AND RETRY WITH DIFFERENT INPUT");
        }
        return firstNumber/secondNumber;
    }


}
