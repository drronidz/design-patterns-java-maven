package com.course.three;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 12:20 AM
*/

public class ObjectAdapter {

    private IIntegerValue integerValue;

    public ObjectAdapter(IIntegerValue integerValue) {
        this.integerValue = integerValue;
    }

    public int getInteger () {
        return 3 + this.integerValue.getInteger();
    }
}
