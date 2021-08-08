package com.course;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 2:21 PM
*/

public interface Builder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}
