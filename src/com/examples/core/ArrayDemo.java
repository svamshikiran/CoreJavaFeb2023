package com.examples.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDemo {

    public static void main(String args[]){
        // [] shows the variable is an array variable
        double marks[] = {89, 95, 90.5, 99, 94, 87};

        try {
            //System.out.println("VALUE AT POSITION 2: " + marks[-1]);
            marks[6] = 90;
        }
        catch(Exception ex){
            System.out.println("EXCEPTION OCCURRED: "+ex.getLocalizedMessage());
        }


        double totalMarks = 0;
        int position = 0;

        while(position < marks.length){
            totalMarks = totalMarks + marks[position];
            position++;
        }
        System.out.println("TOTAL MARKS: "+totalMarks);
    }
}
