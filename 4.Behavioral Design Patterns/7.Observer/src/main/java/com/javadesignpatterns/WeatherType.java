package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 12:50 AM
*/

public enum  WeatherType {
    SUNNY("Sunny"),
    RAINY("Rainy"),
    WINDY("Windy"),
    COLD("Cold");


    private final String description;

    WeatherType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
