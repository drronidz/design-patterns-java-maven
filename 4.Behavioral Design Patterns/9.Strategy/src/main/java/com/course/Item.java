package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/23/2021 2:11 AM
*/

public class Item {
    private final String barCode;
    private final double price;


    public Item(String barCode, double price) {
        this.barCode = barCode;
        this.price = price;
    }

    public String getBarCode() {
        return barCode;
    }

    public double getPrice() {
        return price;
    }
}
