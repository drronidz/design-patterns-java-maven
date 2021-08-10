package com.javadevcentral;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 3:33 PM
*/



public class StarFlyweight implements Star {

    private final String name;
    private final Color color;
    private long weight;
    private long mass;
    private long birghtness;
    private long gravitationalForce;

    public StarFlyweight(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.weight = builder.weight;
        this.mass = builder.mass;
        this.birghtness = builder.brightness;
        this.gravitationalForce = builder.gravitationalForce;
    }

    // The location
    private int x;
    private int y;

    @Override
    public void extractGem(Location location) {
        System.out.println("Extracting the gems of star " + name + " of color "
                + color + " at location (" + location.getX() +", " + location.getY() + ")");
    }

    public static Builder builder(String name, Color color) {
        return new Builder(name, color);
    }

    public static class Builder {
        private final String name;
        private final Color color;

        // default values
        private long weight = 1000;
        private long mass = 2000;
        private long brightness = 200;
        private long gravitationalForce = 100;

        public Builder(String name, Color color) {
            this.name = name;
            this.color = color;
        }

        public Builder weight(long weight) {
            this.weight = weight;
            return this;
        }

        public Builder mass (long mass) {
            this.mass = mass;
            return this;
        }

        public Builder brightness(long brightness) {
            this.brightness = brightness;
            return this;
        }

        public Builder gravitationalForce(long gravitationalForce) {
            this.gravitationalForce = gravitationalForce;
            return this;
        }

        public StarFlyweight build() {
            return new StarFlyweight(this);
        }
    }
}
