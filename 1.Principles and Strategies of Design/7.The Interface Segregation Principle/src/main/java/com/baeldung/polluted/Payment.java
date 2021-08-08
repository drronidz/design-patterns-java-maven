package com.baeldung.polluted;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/8/2021 2:38 PM
*/

import java.util.List;

public interface Payment {
    void initiatePayments();
    Object status();
    List<Object> getPayments();

    //Loan related methods
    void intiateLoanSettlement();
    void initiateRePayment();
}
