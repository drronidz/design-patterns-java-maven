package com.course;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/21/2021 1:52 AM
*/



public class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 190;
    }

    @Override
    int getCubicCapacity() {
        return 5;
    }

    boolean setHatchBack() {
        return true;
    }
}
