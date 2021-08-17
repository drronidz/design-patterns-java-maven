package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/17/2021 5:02 PM
*/

public interface Iterator {

    // indicates whether there are more elements to iterator over
    public boolean hasNext();

    // returns the next element
    public Object next();
}
