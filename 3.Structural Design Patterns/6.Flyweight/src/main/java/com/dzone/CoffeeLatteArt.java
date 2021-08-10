package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 1:52 AM
*/

public enum  CoffeeLatteArt {

    DISNEY("Disney"), LITTLE_BUNNY("Little Bunny"),
    FRENCH("French"), BARISTA_SWAG("Barista Swag"),
    FISHBONE("Fishbone"), MALAYSIAN_BUDDHA("Malaysian Buddha"),
    CAT("Cat");

    private final String name;

    CoffeeLatteArt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
