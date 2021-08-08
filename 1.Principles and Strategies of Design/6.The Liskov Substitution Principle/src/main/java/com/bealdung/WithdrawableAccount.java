package com.bealdung;/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 1:03 AM
*/

import java.math.BigDecimal;

public class WithdrawableAccount extends Account {

    @Override
    protected void deposit(BigDecimal amount) {

    }
    /**
     * Reduces the balance of the account by the specified amount
     * provided given amount > 0 and account meets minimum available
     * balance criteria.
     *
     * @param amount
     */
    protected void withdraw(BigDecimal amount) {

    }
}
