package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 12:24 AM
*/

public class CounterTerrorist implements Player {

    // intrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    public CounterTerrorist() {
        TASK = "Diffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + " : Task is " + TASK);
    }
}
