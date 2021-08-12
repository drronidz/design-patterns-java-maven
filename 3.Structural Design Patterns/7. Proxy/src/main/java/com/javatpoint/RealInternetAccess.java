package com.javatpoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:20 PM
*/

public class RealInternetAccess implements OfficeInternetAccess {
    private final String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: " + employeeName);
    }
}
