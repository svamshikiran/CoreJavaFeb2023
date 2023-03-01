package com.examples.core;

public class CharsAndStrings {

    public static void main(String args[]){
        char ch = '&'; // single characters with single quotes

        String str = "JAVA PROGRAMMING"; //group of characters enclosed in double quotes

        System.out.println("CHARACTER AT POSITION 8: "+str.charAt(8));

        System.out.println("REPLACE OPTION: "+str.replace('M', 'N'));

        System.out.println("SUBTRING : "+str.substring(6, 9));

    }

}
