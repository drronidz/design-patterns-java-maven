package com.javadevcentral;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 3:33 PM
*/



public class Star {
    private String name;
    private Color color;
    private long weight;
    private long mass;
    private long birghtness;
    private long gravitationalForce;

    // The location
    private int x;
    private int y;

    public void extractGem() {
        System.out.println("Extracting the gems of star " + name + " of color "
                + color + " at location (" + x +", " + y + ")");
    }
}
