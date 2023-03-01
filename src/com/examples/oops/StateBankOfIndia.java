package com.examples.oops;

public class StateBankOfIndia implements BankInterface{
    @Override
    public String createAccount() {
        return "SBI123456";
    }

    @Override
    public void depositAmount(String accountNumber) {
        System.out.println("SBI AMOUNT DEPOSITED");
    }
}
