package com.refactoring;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/5/2021 12:02 AM
*/


public class Client {
    public static void main(String[] args) {

        deviceTest(new TV());
        deviceTest(new Radio());

    }

    public static void deviceTest(Device device) {
        System.out.println("Tests with basic remote.\n");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.\n");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
