package com.javatpoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:24 PM
*/

import java.util.Random;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private final String employeeName;
    private RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if(getRole(employeeName) > 4) {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        } else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }

    public int getRole(String employeeName) {
        // Check role from the database based on Name and designation
        // return job level or job designation

        int min = 1;
        int max = 10;
        Random random = new Random();

        return random.nextInt(max - min + 1) + min;
    }
}
