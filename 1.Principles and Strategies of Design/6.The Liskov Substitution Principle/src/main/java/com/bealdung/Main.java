package com.bealdung;/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 12:27 AM
*/



import java.math.BigDecimal;

public class Main {
    // Subtypes must be substitutable for their base types.
    public static void main(String[] args) {
        Account myFixedTermDepositAccount = new FixedTermDepositAccount();
        myFixedTermDepositAccount.deposit(new BigDecimal(1000.00));

        BankingAppWithdrawalService withdrawalService = new BankingAppWithdrawalService((WithdrawableAccount) myFixedTermDepositAccount);
        withdrawalService.withdraw(new BigDecimal("100.00"));
    }
}
