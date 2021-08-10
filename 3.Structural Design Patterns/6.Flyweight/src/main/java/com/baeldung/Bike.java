package com.baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 1:23 AM
*/

import java.awt.*;

public class Bike implements Vehicle {

    private final Engine engine;

    private final Color color;


    public Bike(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;

        // Building a new bike is a very expensive operations!
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            System.out.println("Error while creating a new bike");
            exception.getMessage();
        }
    }

    @Override
    public void start() {
        System.out.println("Bike is starting !");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping!");
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
