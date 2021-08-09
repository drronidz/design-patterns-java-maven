package com.challenge;

/*
PROJECT NAME : design-patterns-java-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/10/2021 12:21 AM
*/

public class Terrorist implements Player {

    // intrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    public Terrorist() {
        TASK = "Plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " : Task is " + TASK);
    }
}
