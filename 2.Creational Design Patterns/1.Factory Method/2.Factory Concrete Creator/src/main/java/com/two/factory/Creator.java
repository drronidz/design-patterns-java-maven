package com.two.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 12:14 AM
*/

public interface Creator <T> {
    T create(String type);
}
