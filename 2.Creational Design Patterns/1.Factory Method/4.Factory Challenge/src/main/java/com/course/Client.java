package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/23/2021 6:46 PM
*/

import com.course.animal.Animal;
import com.course.factory.AnimalFactory;
import com.course.factory.ConcreteFactory;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("#### Factory Pattern Demo ####");

        AnimalFactory animalFactory = new ConcreteFactory();

        Animal duck = animalFactory.getAnimalType("Duck");
        duck.speak();

        Animal tiger = animalFactory.getAnimalType("Tiger");
        tiger.speak();

        Animal lion = animalFactory.getAnimalType("Lion");
        lion.speak();
    }
}
