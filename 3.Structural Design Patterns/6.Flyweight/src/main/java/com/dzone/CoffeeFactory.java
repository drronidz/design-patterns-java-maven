package com.dzone;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 1:55 AM
*/

import java.util.ArrayList;
import java.util.List;

public class CoffeeFactory {

    protected static List<Coffee> coffeeCache = new ArrayList<>();

    public static Coffee makeCoffee(CoffeeFlavour flavourName, CoffeeLatteArt latteArt) {
        Coffee coffee = new Coffee(flavourName, latteArt);
        System.out.printf("Making '%s' with Latte Art '%s'.\n", coffee.getFlavourName(), coffee.getLatteArt());
        coffeeCache.add(coffee);
        return coffee;
    }

    public static int getNumberOfCoffee() {
        return coffeeCache.size();
    }
}
