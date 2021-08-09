package com.journaldev;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/9/2021 1:06 AM
*/

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("-------------------\n");

        Car sportsLuxuryCar =
                new SportsCar(
                        new LuxuryCar(
                                new BasicCar()));

        sportsLuxuryCar.assemble();
    }
}
