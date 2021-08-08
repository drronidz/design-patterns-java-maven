package com.refactoring;

/*
PROJECT NAME : design-patterns-java
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/5/2021 12:16 AM
*/



public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
