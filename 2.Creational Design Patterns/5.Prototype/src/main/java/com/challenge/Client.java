package com.challenge;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/30/2021 11:43 PM
*/

public class Client {
    public static void main(String[] args) {
        System.out.println("####### Prototype Pattern #######\n");

        BasicCarCache.loadCache();

        BasicCar basicCarOne = BasicCarCache.getCar("Green Nano");

        // Price will be more than 100000 for sure
        basicCarOne.price = basicCarOne.price + BasicCar.setPrice();

        System.out.println("Car is: " + basicCarOne.modelName + " and it's price is RS." + basicCarOne.price);

        basicCarOne = BasicCarCache.getCar("Ford Yellow");
        // Price will be more than 500000 for sure
        basicCarOne.price = basicCarOne.price + BasicCar.setPrice();

        System.out.println("Car is: " + basicCarOne.modelName + " and it's price is RS." + basicCarOne.price);


    }
}
