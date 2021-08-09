package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 5:31 PM
*/

public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " On");
    }

    public void off() {
        System.out.println(description + " Off");
    }

    public void dim(int level) {
        System.out.println(description + " dimming to " + level + "%");
    }

    @Override
    public String toString() {
        return description;
    }
}
