package com.course;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 4:22 PM
*/

public class Bike extends Vehicle {
    public Bike(Workshop workshopOne, Workshop workshopTwo) {
        super(workshopOne, workshopTwo);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike ");
        workshopOne.work();
        workshopTwo.work();
    }
}
