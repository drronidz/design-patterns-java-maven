package com.bealdung;/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/19/2021 12:38 AM
*/

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private final WithdrawableAccount withdrawableAccount;

    public BankingAppWithdrawalService(WithdrawableAccount withdrawableAccount) {
        this.withdrawableAccount = withdrawableAccount;
    }
    public void withdraw(BigDecimal amount) {
        withdrawableAccount.withdraw(amount);
    }
}
