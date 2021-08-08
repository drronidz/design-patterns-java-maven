package com.challenge;/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 7/30/2021 11:37 PM
*/

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable<String, BasicCar> basicCarMap = new Hashtable<>();

    public static BasicCar getCar(String carName) {
        BasicCar cachedBasicCar = basicCarMap.get(carName);
        return (BasicCar) cachedBasicCar.clone();
    }

    public static void loadCache() {
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.price = 100000;
        basicCarMap.put("Green Nano", nano_base);

        BasicCar ford_basic = new Ford("Ford Yellow");
        ford_basic.price = 500000;
        basicCarMap.put("Ford Yellow", ford_basic);
    }
}
