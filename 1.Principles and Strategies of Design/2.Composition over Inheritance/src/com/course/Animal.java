package com.course;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/1/2021 5:53 PM
*/

public abstract class Animal {
    String sound;
    int speed;

    public Animal(String sound, int speed) {
        this.sound = sound;
        this.speed = speed;
    }

    public void speak() {
        System.out.println(sound);
    }

    public void run() {
        System.out.println("Running with " + speed + "mph");
    }
}
