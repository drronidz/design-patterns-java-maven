package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/14/2021 4:49 PM
*/

public class Stock {
    private final String name = "Google";
    private final int quantity = 1000;

    public void buy() {
        System.out.println("Stock [ Name: " + name + " , Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + " , Quantity: " + quantity + " ] sold");
    }

}
