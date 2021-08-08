package com.course;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/4/2021 4:18 PM
*/

abstract class Vehicle {
    protected Workshop workshopOne;
    protected Workshop workshopTwo;

    public Vehicle(Workshop workshopOne, Workshop workshopTwo) {
        this.workshopOne = workshopOne;
        this.workshopTwo = workshopTwo;
    }

    abstract public void manufacture();
}
