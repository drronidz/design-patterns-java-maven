package com.course.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 6:43 PM
*/

import com.course.animal.Animal;
import com.course.animal.Duck;
import com.course.animal.Tiger;

public class ConcreteFactory extends AnimalFactory {
    @Override
    public Animal getAnimalType(String type) throws Exception {
        return switch (type) {
            case "Duck" -> new Duck();
            case "Tiger" -> new Tiger();
            default -> throw new Exception("Animal type: " + type + " cannot be instantiated!");
        };
    }
}
