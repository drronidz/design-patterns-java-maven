package com.javadesignpatterns;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/24/2021 1:06 AM
*/

public class Client {
    public static void main(String[] args) {

        var thief = new HalflingThief(new HitAndRunMethod());
        thief.steal();
        System.out.println("\n--------------------- Changing Template ---------------------\n");

        thief.changeTemplate(new SubtleMethod());
        thief.steal();
    }
}
