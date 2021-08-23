package com.course;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 12:29 AM
*/

abstract class HouseTemplate {

    // Template method, final so subclasses cannot override it
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println(this.getClass().getSimpleName() + " is built");
    }

    // default implementation, hook method
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    // methods to be implemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }
}

class WoodenHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
}

class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}
