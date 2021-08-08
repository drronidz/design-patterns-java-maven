package com.baeldung.fixed;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/8/2021 2:35 PM
*/

public interface Loan extends Payment {
    void intiateLoanSettlement();
    void initiateRePayment();
}
