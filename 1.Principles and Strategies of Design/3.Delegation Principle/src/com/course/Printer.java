package com.course;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/20/2021 7:49 PM
*/

public class Printer {

    // The Delegator
    RealPrinter realPrinter = new RealPrinter();

    // Create the Delegate
    public void print () {
        realPrinter.print();
    }
}
