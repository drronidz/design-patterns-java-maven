package com.course;

/*
PROJECT NAME : design-patterns-java
Author Name : @ DRRONIDZ
DATE : 7/21/2021 1:51 AM
*/



public class Bus extends Vehicle {
    @Override
    int getSpeed() {
        return 100;
    }

    @Override
    int getCubicCapacity() {
        return 10;
    }
    String getEmergencyExitLoc() {
        return "The emergency loc";
    }
}
