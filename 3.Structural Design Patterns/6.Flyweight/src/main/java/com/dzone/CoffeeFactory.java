package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 1:55 AM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoffeeFactory {

    protected static HashMap<CoffeeFlavour, Coffee> coffeeCache = new HashMap<>();

    public static Coffee makeCoffee(CoffeeFlavour flavourName, CoffeeLatteArt latteArt) {
        Coffee coffee = coffeeCache.get(flavourName);
        if(coffee == null) {
            coffee = new Coffee(flavourName);
            coffeeCache.put(flavourName, coffee);
        }
        System.out.printf("Making '%s' with Latte Art '%s'.\n", coffee.getFlavourName(), coffee.setLatteArt(latteArt));
        return coffee;
    }

    public static int getNumberOfCoffee() {
        return coffeeCache.size();
    }
}
