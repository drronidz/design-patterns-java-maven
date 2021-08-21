package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/21/2021 1:01 AM
*/

public class Client {
    public static void main(String[] args) {
        var weather = new Weather();

        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        // Generic observer inspired by Java Generics and Collections by Naftalin & Wadler
        System.out.println(" ---- Running generic version ---- ");

    }
}
