package com.one.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/22/2021 11:20 PM
*/

public interface Creator <T> {
     T create(String productClass);
}
