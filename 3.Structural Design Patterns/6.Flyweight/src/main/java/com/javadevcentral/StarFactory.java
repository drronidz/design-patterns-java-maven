package com.javadevcentral;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 3:51 PM
*/

import java.util.HashMap;
import java.util.Map;

public class StarFactory {
    private final Map<String, Star> starCache = new HashMap<>();

    // New Style
    public Star getStar(String name, Color color,
                        long weight, long mass,
                        long brightness, long gravitationalForce) {
        return starCache.computeIfAbsent(getKey(name, color),
                startName -> StarFlyweight.builder(name, color)
                        .weight(weight)
                        .mass(mass)
                        .brightness(brightness)
                        .gravitationalForce(gravitationalForce)
                        .build());
    }


    // Old Style
    public Star makeStar(String name, Color color, long weight, long mass,
                        long brightness, long gravitationalForce) {

        if (starCache.containsKey(name)) {
            return starCache.get(name);
        }
        Star star = StarFlyweight.builder(name, color)
                .weight(weight)
                .mass(mass)
                .brightness(brightness)
                .gravitationalForce(gravitationalForce)
                .build();
        starCache.put(name, star);
        return star;
    }

    // Another Methods which ignores the other fields (uses only name and color)
    // to keep the example simple

    public Star getStar(String name, Color color) {
        return starCache.computeIfAbsent(getKey(name, color),
                starName -> StarFlyweight.builder(name, color)
                        .build()
                );
    }

    private String getKey(String name, Color color) {
        return name + " | " + color.name();
    }


}
