package com.javatpoint;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 11:47 PM
*/

public class Iphone implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println(" Iphone 6 ");
    }

    @Override
    public void price() {
        System.out.println(" 800 $ ");
    }
}
