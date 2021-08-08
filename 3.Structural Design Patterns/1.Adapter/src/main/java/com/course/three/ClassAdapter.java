package com.course.three;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/3/2021 12:19 AM
*/



public class ClassAdapter extends IntegerValue {
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}
