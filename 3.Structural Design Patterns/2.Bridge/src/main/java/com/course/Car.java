package com.course;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 4:20 PM
*/

public class Car extends Vehicle {
    public Car(Workshop workshopOne, Workshop workshopTwo) {
        super(workshopOne, workshopTwo);
    }

    @Override
    public void manufacture() {
        System.out.println("Car ");
        workshopOne.work();
        workshopTwo.work();
    }
}
