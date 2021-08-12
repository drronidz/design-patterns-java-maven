package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/12/2021 11:06 PM
*/

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to " + serverHost);
    }
}
