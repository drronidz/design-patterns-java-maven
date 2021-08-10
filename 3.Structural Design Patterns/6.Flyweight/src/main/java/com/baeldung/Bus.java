package com.baeldung;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 1:20 AM
*/

import java.awt.*;

public class Bus implements Vehicle {

    private final Color color;

    private final Engine engine;

    public Bus(Engine engine, Color color) {
        this.color = color;
        this.engine = engine;

        // Building a new bus is a very expensive operations!
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            System.out.println("Error while creating a new bus");
            exception.getMessage();
        }
    }

    @Override
    public void start() {
        System.out.println("Bus is starting !");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping!");
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
