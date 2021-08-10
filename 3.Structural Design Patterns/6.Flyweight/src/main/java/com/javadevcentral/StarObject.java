package com.javadevcentral;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 4:02 PM
*/

public class StarObject {
    private static final StarFactory STAR_FACTORY = new StarFactory();
    private final Star starFlyweight;
    private final Location location;

    public StarObject(String starName, Color starColor, Location location) {
        this.starFlyweight = STAR_FACTORY.getStar(starName, starColor);
        this.location = location;
    }

    public void extractGem() {
        starFlyweight.extractGem(location);
    }

    public Star getStar() {
        return starFlyweight;
    }

    public Location getLocation() {
        return location;
    }
}
