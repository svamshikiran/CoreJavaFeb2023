package com.examples.oops;

public class ICICIBank implements BankInterface{


    @Override
    public String createAccount() {
        System.out.println("ACCOUNT CREATED");
        return "ICIC01234";
    }

    @Override
    public void depositAmount(String accountNumber) {
        System.out.println("AMOUNT DEPOSITED");
    }
}
