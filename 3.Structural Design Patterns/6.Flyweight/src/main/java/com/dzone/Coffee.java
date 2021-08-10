package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 1:54 AM
*/

public class Coffee {

    protected final CoffeeFlavour flavourName; // intrinsic attribute


    public Coffee(CoffeeFlavour flavourName) {
        super();
        this.flavourName = flavourName;
    }

    public CoffeeFlavour getFlavourName() {
        return flavourName;
    }

    protected CoffeeLatteArt setLatteArt(CoffeeLatteArt latteArt) {
        /*
        * CoffeeLateART LatteArt will be act as extrinsic attribute
        * So, that will be required in creating and processing of Coffee
        * object as method parameters and will not be stored as class members
        * */
        return latteArt;
    }


}
