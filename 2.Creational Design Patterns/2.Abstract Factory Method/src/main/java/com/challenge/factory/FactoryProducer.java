package com.challenge.factory;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/24/2021 1:59 AM
*/

public class FactoryProducer {
    public static MovieFactory getFactory(String choice) {
        return switch (choice) {
            case "HollyWoodMovie" -> new HollyWoodMovieFactory();
            case "BollyWoodMovie" -> new BollyWoodMovieFactory();
            default -> null;
        };
    }
}
