package com.course;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/28/2021 2:30 PM
*/

public class Director {
    Builder builder;

    public void construct(Builder builder) {
        this.builder = builder;
        this.builder.buildBody();
        this.builder.insertWheels();
        this.builder.addHeadlights();
    }
}
