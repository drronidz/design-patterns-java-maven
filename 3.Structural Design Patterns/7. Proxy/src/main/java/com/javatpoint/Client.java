package com.javatpoint;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:30 PM
*/

public class Client {
    public static void main(String[] args) {
        OfficeInternetAccess officeInternetAccess =
                new ProxyInternetAccess("Ashwani Rajput");

        officeInternetAccess.grantInternetAccess();
    }
}
