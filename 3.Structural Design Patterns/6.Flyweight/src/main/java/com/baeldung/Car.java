package com.baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 12:48 AM
*/

import java.awt.*;

public class Car implements Vehicle {

    // extrinsic data
    private final Engine engine;

    // extrinsic data
    private final Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;

        // Building a new car is a very expensive operations!
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            System.out.println("Error while creating a new car");
            exception.getMessage();
        }
    }

    @Override
    public void start() {
        System.out.println("Car is starting !");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping!");
        engine.stop();
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void print() {
        System.out.println(" This is a " + getClass().getSimpleName() + " with " + color.toString() + " color");
    }
}
