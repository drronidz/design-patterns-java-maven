package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 1:54 AM
*/

public class Coffee {

    protected final CoffeeFlavour flavourName;
    protected final CoffeeLatteArt latteArt;

    public Coffee(CoffeeFlavour flavourName, CoffeeLatteArt latteArt) {
        this.flavourName = flavourName;
        this.latteArt = latteArt;
    }

    public CoffeeFlavour getFlavourName() {
        return flavourName;
    }

    public CoffeeLatteArt getLatteArt() {
        return latteArt;
    }


}
