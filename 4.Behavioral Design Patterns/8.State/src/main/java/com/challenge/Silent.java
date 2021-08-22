package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/22/2021 1:58 AM
*/

public class Silent implements MobileAlert {
    @Override
    public void alert() {
        System.out.println("Silent ...");
    }
}
