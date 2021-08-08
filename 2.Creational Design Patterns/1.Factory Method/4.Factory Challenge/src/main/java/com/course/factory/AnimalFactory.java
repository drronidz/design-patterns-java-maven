package com.course.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 6:42 PM
*/

import com.course.animal.Animal;

public abstract class AnimalFactory {
    public abstract Animal getAnimalType(String type) throws Exception;
}
