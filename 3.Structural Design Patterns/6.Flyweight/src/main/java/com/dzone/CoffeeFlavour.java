package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 1:49 AM
*/

public enum CoffeeFlavour {
    COPPUCCINO("Cappuccino"), ESPRESSO("Espresso"),
    FRAPPUCCINO("Frappuccino"), AFFOGATO("Affogato"),
    LATTE("Latte");

    private final String name;

    CoffeeFlavour(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
