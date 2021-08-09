package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/7/2021 5:27 PM
*/

public class Projector {
    String description;
    DVDPlayer dvdPlayer;

    public Projector(String description, DVDPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println(description + " On");
    }

    public void off() {
        System.out.println(description + " Off");
    }

    public void wideScreenMode() {
        System.out.println(description + " in windescreen mode (16x9 aspect ratio");
    }

    public void tvMode() {
        System.out.println(description + "in TV mode (4x3 aspect ratio)");
    }

    @Override
    public String toString() {
        return description;
    }
}
