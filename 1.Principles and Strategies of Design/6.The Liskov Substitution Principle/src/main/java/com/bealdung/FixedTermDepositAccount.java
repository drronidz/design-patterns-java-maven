package com.bealdung;/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 12:40 AM
*/

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account {
    // Overridden methods ...
    @Override
    protected void deposit(BigDecimal amount) {

    }

//    @Override
//    protected void withdraw(BigDecimal amount) {
//        // the bank doesn't allow withdrawals for the fixed-term deposit accounts.
//        // The new com.com.example.one.FixedTermDepositAccount class can't meaningfully provide the withdraw method that
//        // com.com.example.one.Account defines.
//        throw new UnsupportedOperationException("Withdrawals are not supported by com.com.example.one.FixedTermDepositAccount");
//    }
}
